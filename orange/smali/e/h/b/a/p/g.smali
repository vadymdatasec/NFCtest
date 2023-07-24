.class public Le/h/b/a/p/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Le/h/b/a/m/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le/h/b/a/p/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/h/b/a/p/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/h/b/a/m/d;Le/h/b/a/m/d;)I
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-virtual {p1}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object p1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object p2

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Le/h/b/a/m/d;

    check-cast p2, Le/h/b/a/m/d;

    invoke-virtual {p0, p1, p2}, Le/h/b/a/p/g;->a(Le/h/b/a/m/d;Le/h/b/a/m/d;)I

    move-result p1

    return p1
.end method
