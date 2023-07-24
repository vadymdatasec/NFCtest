.class public Le/h/d/a/a/s/k0/r;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# instance fields
.field public final a:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/k0/r;->a:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    return-void
.end method


# virtual methods
.method public a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 2

    .line 2
    iget-object v0, p0, Le/h/d/a/a/s/k0/r;->a:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Le/h/d/a/a/s/k0/v;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Le/h/d/a/a/s/k0/v;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Le/h/d/a/a/s/k0/v;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/r;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    return-object p1
.end method
