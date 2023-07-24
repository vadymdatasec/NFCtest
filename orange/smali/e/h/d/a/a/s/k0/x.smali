.class public Le/h/d/a/a/s/k0/x;
.super Le/h/d/a/a/s/k0/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/h/d/a/a/s/k0/z<",
        "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 1

    const-string v0, "badge"

    .line 1
    invoke-direct {p0, p2, v0}, Le/h/d/a/a/s/k0/z;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/k0/x;->c:Lfr/mbs/binary/Octets;

    return-void
.end method


# virtual methods
.method public a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Landroid/content/ContentValues;
    .locals 2

    .line 2
    new-instance v0, Le/h/d/a/a/s/k0/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Le/h/d/a/a/s/k0/b;-><init>(Z)V

    iget-object v1, p0, Le/h/d/a/a/s/k0/x;->c:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, p1, v1}, Le/h/d/a/a/s/k0/b;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Landroid/content/ContentValues;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Landroid/content/ContentValues;
    .locals 0

    .line 1
    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/x;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Landroid/content/ContentValues;

    move-result-object p1

    return-object p1
.end method
