.class public Le/h/d/a/a/s/d;
.super Le/h/d/a/a/s/h0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/h/d/a/a/s/h0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/h/d/a/a/s/h0;->b:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "update user set contactlessId = \'00000001\' where contactlessId is null"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "CREATE TABLE user (contactlessId TEXT  UNIQUE NOT NULL,email TEXT,firstname TEXT,lastname TEXT,walletId TEXT,cipheredUri TEXT PRIMARY KEY,simCentric BOOLEAN DEFAULT 0,id TEXT UNIQUE);"

    const-string v2, "user"

    .line 2
    invoke-virtual {p0, v1, v2, v0}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method
