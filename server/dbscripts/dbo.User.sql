CREATE TABLE [dbo].[User]
(
	[userid] INT NOT NULL PRIMARY KEY IDENTITY, 
    [name] NVARCHAR(50) NOT NULL, 
    [username] NVARCHAR(50) NOT NULL, 
    [password] NVARCHAR(50) NOT NULL, 
    [balance] MONEY NOT NULL DEFAULT 0
)
