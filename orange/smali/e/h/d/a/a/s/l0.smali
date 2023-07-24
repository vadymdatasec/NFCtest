.class public Le/h/d/a/a/s/l0;
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

    const-string v0, "badge"

    const-string v1, "isTransactionAllowed"

    const-string v2, "BOOLEAN DEFAULT 0"

    .line 1
    invoke-virtual {p0, v0, v1, v2}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Le/h/d/a/a/s/h0;->b:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "delete from tokenTransaction"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method
