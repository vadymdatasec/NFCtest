.class public Le/h/d/a/a/s/k0/h;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# instance fields
.field public final a:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/k0/h;->a:Lfr/mbs/binary/Octets;

    return-void
.end method


# virtual methods
.method public a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 2
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
    new-instance v0, Le/h/d/a/a/s/k0/s;

    iget-object v1, p0, Le/h/d/a/a/s/k0/h;->a:Lfr/mbs/binary/Octets;

    invoke-direct {v0, v1}, Le/h/d/a/a/s/k0/s;-><init>(Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/s;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Le/h/d/a/a/s/k0/j;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Le/h/d/a/a/s/k0/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Le/h/d/a/a/s/k0/j;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
