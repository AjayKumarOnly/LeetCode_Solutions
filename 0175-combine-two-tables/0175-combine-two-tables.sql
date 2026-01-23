select Person.firstName,Person.lastName,Address.city,Address.state from person left join Address on Person.PersonId = Address.PersonId;
