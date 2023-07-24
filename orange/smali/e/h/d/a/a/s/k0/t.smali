.class public Le/h/d/a/a/s/k0/t;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# instance fields
.field public final a:Lfr/mbs/binary/Octets;

.field public final b:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/k0/t;->a:Lfr/mbs/binary/Octets;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/s/k0/t;->b:Lfr/mbs/binary/Octets;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/t;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            ")",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/User;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/h/d/a/a/s/k0/t;->a:Lfr/mbs/binary/Octets;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    .line 3
    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v1

    iget-object v0, p0, Le/h/d/a/a/s/k0/t;->b:Lfr/mbs/binary/Octets;

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v2

    const-string v0, "cipheredUri != ? AND contactlessId = ?"

    goto :goto_0

    :cond_0
    new-array v3, v2, [Ljava/lang/String;

    .line 4
    iget-object v0, p0, Le/h/d/a/a/s/k0/t;->b:Lfr/mbs/binary/Octets;

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v1

    const-string v0, "cipheredUri IS NOT NULL AND contactlessId = ?"

    .line 5
    :goto_0
    new-instance v1, Le/h/d/a/a/s/k0/w;

    invoke-direct {v1, v0, v3}, Le/h/d/a/a/s/k0/w;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
