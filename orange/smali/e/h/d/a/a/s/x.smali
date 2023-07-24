.class public Le/h/d/a/a/s/x;
.super Le/h/d/a/a/s/k0/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/h/d/a/a/s/k0/o<",
        "Le/h/d/a/a/s/z;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 6

    const-string v1, "badge"

    const-string v2, "description"

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/database/Cursor;)Le/h/d/a/a/s/z;
    .locals 2

    const-string v0, "badgeId"

    .line 2
    invoke-static {v0, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    const-string v1, "zoneId"

    .line 3
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 4
    new-instance v1, Le/h/d/a/a/s/z;

    invoke-direct {v1, p1, v0}, Le/h/d/a/a/s/z;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    return-object v1
.end method

.method public bridge synthetic a(Landroid/database/Cursor;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/x;->a(Landroid/database/Cursor;)Le/h/d/a/a/s/z;

    move-result-object p1

    return-object p1
.end method
