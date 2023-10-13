// Create users
CREATE (U1:User {name: 'Mathias', address: 'Skolevej 1'})
CREATE (U2:User {name: 'Mads', address: 'Skolevej 2'})
CREATE (U3:User {name: 'Kasper', address: 'Skolevej 3'})
CREATE (U4:User {name: 'Maria', address: 'Skolevej 4'})

// Create movies
CREATE (M1: Movie {id: 1, title: 'The Equalizer 3', director: 'Antoine Fuqua', yearReleased: 2023, genre: ['Action', 'Crime', 'Thriller']})
CREATE (M2: Movie {id: 2, title: 'Barbie', director: 'Greta Gerwig', yearReleased: 2023, genre: ['Adventure', 'Comedy', 'Fantasy']})
CREATE (M3: Movie {id: 3, title: 'A Haunting in Venice', director: 'Kenneth Branagh', yearReleased: 2023, genre: ['Crime', 'Drama', 'Horror']})
CREATE (M4: Movie {id: 4, title: 'Oppenheimer', director: 'Ben Wheatley', yearReleased: 2023, genre: ['Action', 'Adventure', 'Horror']})
CREATE (M5: Movie {id: 5, title: 'Meg 2: The Trench', director: 'Christopher Nolan', yearReleased: 2023, genre: ['Biography', 'Drama', 'History']})
CREATE (M6: Movie {id: 6, title: 'Mission: Impossible - Dead Reckoning Part One', director: 'Christopher McQuarrie', yearReleased: 2023, genre: ['Action', 'Adventure', 'Thriller']})
CREATE (M7: Movie {id: 7, title: 'Gran Turismo', director: 'Neill Blomkamp', yearReleased: 2023, genre: ['Action', 'Adventure', 'Drama']})
CREATE (M8: Movie {id: 8, title: 'John Wick: Chapter 4', director: 'Chad Stahelski', yearReleased: 2023, genre: ['Action', 'Crime', 'Thriller']})

// Create TV shows
CREATE (T1: TV {id: 1, title: 'Sex Education', director: 'Laurie Nunn', yearReleased: 2019, genre: ['Comedy', 'Drama']})
CREATE (T2: TV {id: 2, title: 'Only Murders in the Building', director: 'John Hoffman', yearReleased: 2021, genre: ['Comedy', 'Crime', 'Drama']})
CREATE (T3: TV {id: 3, title: 'Suits', director: 'Aaron Korsh', yearReleased: 2011, genre: ['Comedy', 'Drama']})
CREATE (T4: TV {id: 4, title: 'Game of Thrones', director: 'David Benioff', yearReleased: 2011, genre: ['Action', 'Adventure', 'Drama']})
CREATE (T5: TV {id: 5, title: 'Breaking Bad', director: 'Vince Gilligan', yearReleased: 2008, genre: ['Crime', 'Drama', 'Thriller']})
CREATE (T6: TV {id: 6, title: 'The Walking Dead', director: 'Frank Darabont', yearReleased: 2010, genre: ['Drama', 'Horror', 'Thriller']})
CREATE (T7: TV {id: 7, title: 'Lupin', director: 'George Kay', yearReleased: 2021, genre: ['Action', 'Crime', 'Drama']})
CREATE (T8: TV {id: 8, title: 'Stranger Things', director: 'Matt Duffer', yearReleased: 2016, genre: ['Drama', 'Fantasy', 'Horror']})