.class public Le/h/d/a/a/n/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/User;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/String;

.field public d:Le/h/d/a/a/p/a/a/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/h/d/a/a/p/a/a/a;

    invoke-direct {v0}, Le/h/d/a/a/p/a/a/a;-><init>()V

    iput-object v0, p0, Le/h/d/a/a/n/r;->d:Le/h/d/a/a/p/a/a/a;

    .line 3
    iput-object p1, p0, Le/h/d/a/a/n/r;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Le/h/d/a/a/n/r;Lcom/orange/oab/contactless/packid/hce/user/User;Le/h/d/a/a/p/a/a/a;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Le/h/d/a/a/n/r;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Le/h/d/a/a/p/a/a/a;ZZ)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/User;",
            ">;"
        }
    .end annotation

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    iget-object v1, p0, Le/h/d/a/a/n/r;->a:Landroid/content/Context;

    invoke-static {v1}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v1

    invoke-virtual {v1}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;

    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 8
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z

    move-result v3

    if-nez v3, :cond_0

    .line 9
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final a(Landroid/content/Context;ZZLjava/lang/String;)V
    .locals 2

    .line 10
    iget-object v0, p0, Le/h/d/a/a/n/r;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11
    invoke-static {p1}, Lcom/orange/oab/contactless/packid/service/Aid;->register(Landroid/content/Context;)V

    if-eqz p3, :cond_0

    .line 12
    new-instance p1, Le/h/d/a/a/r/a;

    iget-object p2, p0, Le/h/d/a/a/n/r;->a:Landroid/content/Context;

    invoke-direct {p1, p2}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    iget-object p2, p0, Le/h/d/a/a/n/r;->d:Le/h/d/a/a/p/a/a/a;

    invoke-virtual {p1, p2}, Le/h/d/a/a/r/a;->a(Le/h/d/a/a/p/a/a/a;)V

    :cond_0
    return-void

    .line 13
    :cond_1
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/n/r;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 14
    new-instance v1, Le/h/d/a/a/n/q;

    invoke-direct {v1, p0, p1, v0, p3}, Le/h/d/a/a/n/q;-><init>(Le/h/d/a/a/n/r;Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Z)V

    .line 15
    invoke-virtual {v1, v0, p2, p4}, Le/h/d/a/a/n/p;->a(Lcom/orange/oab/contactless/packid/hce/user/User;ZLjava/lang/String;)V
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 16
    new-instance p3, Le/h/d/a/a/r/a;

    invoke-direct {p3, p1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    sget p1, Le/h/d/a/a/c;->error_security_configuration_modified:I

    invoke-virtual {p3, p1, p2}, Le/h/d/a/a/r/a;->a(ILjava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/User;Le/h/d/a/a/p/a/a/a;ZZ)V
    .locals 1

    .line 17
    iget-object v0, p0, Le/h/d/a/a/n/r;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    if-eqz p2, :cond_0

    .line 18
    iget-object p1, p0, Le/h/d/a/a/n/r;->d:Le/h/d/a/a/p/a/a/a;

    invoke-virtual {p1, p2}, Le/h/d/a/a/p/a/a/a;->a(Le/h/d/a/a/p/a/a/a;)V

    .line 19
    :cond_0
    iget-object p1, p0, Le/h/d/a/a/n/r;->a:Landroid/content/Context;

    iget-object p2, p0, Le/h/d/a/a/n/r;->c:Ljava/lang/String;

    invoke-virtual {p0, p1, p3, p4, p2}, Le/h/d/a/a/n/r;->a(Landroid/content/Context;ZZLjava/lang/String;)V

    return-void
.end method

.method public a(ZZLjava/lang/String;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Le/h/d/a/a/n/r;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/n/r;->b:Ljava/util/List;

    .line 3
    iput-object p3, p0, Le/h/d/a/a/n/r;->c:Ljava/lang/String;

    .line 4
    iget-object v0, p0, Le/h/d/a/a/n/r;->a:Landroid/content/Context;

    invoke-virtual {p0, v0, p1, p2, p3}, Le/h/d/a/a/n/r;->a(Landroid/content/Context;ZZLjava/lang/String;)V

    return-void
.end method
