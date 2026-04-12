class Solution {
    public double[] internalAngles(int[] sides) {
         double a = sides[0] , b = sides[1] , c = sides[2];
        if(a+b <= c || b+c <= a || a+c <= b){
            return new double[0];
        }
        double x = Math.acos((b*b + c*c - a*a )/ (2*b*c));
        double y = Math.acos((a*a + c*c - b*b )/ (2*a*c));
        double z = Math.acos((a*a + b*b - c*c)/ (2*a*b));

        x = Math.toDegrees(x);
        y = Math.toDegrees(y);
        z = Math.toDegrees(z);

        double[] res = {x,y,z};
        Arrays.sort(res);
        return res;
    }
}