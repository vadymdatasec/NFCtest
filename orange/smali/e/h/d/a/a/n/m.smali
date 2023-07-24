.class public abstract Le/h/d/a/a/n/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(ILandroid/net/Uri;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/n/h;->a(Landroid/content/Context;)Le/a/a/s;

    move-result-object v0

    .line 3
    new-instance v7, Le/h/d/a/a/n/f;

    new-instance v5, Le/h/d/a/a/n/k;

    invoke-direct {v5, p0, p2}, Le/h/d/a/a/n/k;-><init>(Le/h/d/a/a/n/m;Landroid/net/Uri;)V

    new-instance v6, Le/h/d/a/a/n/j;

    invoke-direct {v6, p0}, Le/h/d/a/a/n/j;-><init>(Le/h/d/a/a/n/m;)V

    move-object v1, v7

    move-object v2, v0

    move v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Le/h/d/a/a/n/f;-><init>(Le/a/a/s;ILandroid/net/Uri;Le/h/d/a/a/n/k;Le/h/d/a/a/n/j;)V

    .line 4
    invoke-virtual {v7, p3}, Le/h/d/a/a/n/f;->a(Ljava/util/Map;)V

    const/4 p1, 0x0

    .line 5
    invoke-virtual {v7, p1}, Le/a/a/p;->a(Z)Le/a/a/p;

    .line 6
    new-instance p1, Le/h/d/a/a/n/l;

    invoke-direct {p1}, Le/h/d/a/a/n/l;-><init>()V

    invoke-virtual {v7, p1}, Le/a/a/p;->a(Le/a/a/x;)Le/a/a/p;

    .line 7
    invoke-virtual {v0, v7}, Le/a/a/s;->a(Le/a/a/p;)Le/a/a/p;

    return-void
.end method

.method public abstract a(Landroid/net/Uri;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;,
            Lorg/json/JSONException;,
            Le/h/d/a/a/n/e;
        }
    .end annotation
.end method

.method public a(Landroid/net/Uri;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/n/m;->c(Landroid/net/Uri;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-virtual {p0, p2, p1, v0}, Le/h/d/a/a/n/m;->a(ILandroid/net/Uri;Ljava/util/Map;)V

    return-void
.end method

.method public abstract a(Ljava/lang/Throwable;)V
.end method

.method public b(Landroid/net/Uri;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, v0, p1, p2}, Le/h/d/a/a/n/m;->a(ILandroid/net/Uri;Ljava/util/Map;)V

    return-void
.end method

.method public final c(Landroid/net/Uri;Ljava/util/Map;)Landroid/net/Uri;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/net/Uri;"
        }
    .end annotation

    if-nez p2, :cond_0

    return-object p1

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    .line 2
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method
