CREATE TABLE [dbo].[Product]
(
	[productid] INT NOT NULL PRIMARY KEY, 
    [name] NVARCHAR(50) NOT NULL, 
    [quantity] INT NOT NULL DEFAULT 0, 
    [price] MONEY NOT NULL
)
