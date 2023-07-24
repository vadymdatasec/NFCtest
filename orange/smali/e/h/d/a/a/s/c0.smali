.class public Le/h/d/a/a/s/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Le/h/d/a/a/s/q;


# direct methods
.method public constructor <init>(Le/h/d/a/a/s/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/c0;->a:Le/h/d/a/a/s/q;

    return-void
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "CREATE TABLE tokenTransaction (id TEXT PRIMARY KEY, zoneId TEXT, transactionDate NUMERIC, amountInCents INTEGER, description TEXT);"

    .line 1
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lfr/mbs/binary/Octets;I)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfr/mbs/binary/Octets;",
            "I)",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/domain/Transaction;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, v6, v0

    .line 4
    new-instance p1, Le/h/d/a/a/s/a0;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    const-string v3, "tokenTransaction"

    const-string v4, "ROWID desc"

    const-string v5, "zoneId = ?"

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Le/h/d/a/a/s/a0;-><init>(Le/h/d/a/a/s/c0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object p2, p0, Le/h/d/a/a/s/c0;->a:Le/h/d/a/a/s/q;

    invoke-virtual {p2, p1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public a(Lcom/orange/oab/contactless/packid/domain/Transaction;)V
    .locals 3

    .line 2
    iget-object v0, p0, Le/h/d/a/a/s/c0;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/y;

    const-string v2, "tokenTransaction"

    invoke-direct {v1, p0, p1, v2, p1}, Le/h/d/a/a/s/y;-><init>(Le/h/d/a/a/s/c0;Lcom/orange/oab/contactless/packid/domain/Transaction;Ljava/lang/String;Lcom/orange/oab/contactless/packid/domain/Transaction;)V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    return-void
.end method
