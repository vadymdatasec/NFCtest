.class public Le/h/d/a/a/s/k0/k;
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
    iput-object p1, p0, Le/h/d/a/a/s/k0/k;->a:Lfr/mbs/binary/Octets;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/s/k0/k;->b:Lfr/mbs/binary/Octets;

    return-void
.end method


# virtual methods
.method public a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            ")TT;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/h/d/a/a/s/k0/t;

    iget-object v1, p0, Le/h/d/a/a/s/k0/k;->a:Lfr/mbs/binary/Octets;

    iget-object v2, p0, Le/h/d/a/a/s/k0/k;->b:Lfr/mbs/binary/Octets;

    invoke-direct {v0, v1, v2}, Le/h/d/a/a/s/k0/t;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/t;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 3
    new-instance v2, Le/h/d/a/a/s/k0/j;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Le/h/d/a/a/s/k0/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Le/h/d/a/a/s/k0/j;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
