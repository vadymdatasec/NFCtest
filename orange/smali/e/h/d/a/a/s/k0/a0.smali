.class public Le/h/d/a/a/s/k0/a0;
.super Le/h/d/a/a/s/k0/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/h/d/a/a/s/k0/z<",
        "Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;",
        ">;"
    }
.end annotation


# instance fields
.field public c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)V
    .locals 1

    const-string v0, "tenant"

    .line 1
    invoke-direct {p0, p1, v0}, Le/h/d/a/a/s/k0/z;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/k0/a0;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    return-void
.end method


# virtual methods
.method public a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)Landroid/content/ContentValues;
    .locals 3

    .line 3
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 4
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "name"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getLogoUrl()Ljava/lang/String;

    move-result-object v1

    const-string v2, "logoUrl"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->shouldSendEnrollmentNotification()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "shouldSendEnrollmentNotification"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Landroid/content/ContentValues;
    .locals 0

    .line 1
    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/a0;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)Landroid/content/ContentValues;

    move-result-object p1

    return-object p1
.end method

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

    .line 2
    iget-object v0, p0, Le/h/d/a/a/s/k0/a0;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    invoke-virtual {p0, v0}, Le/h/d/a/a/s/k0/a0;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)Landroid/content/ContentValues;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "tenant"

    invoke-virtual {p1, v2, v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    return-object v1
.end method
