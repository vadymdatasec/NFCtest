.class public final Le/b/a/y/x/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/k0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/k0<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/u0;->a:Ljava/util/Map;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/u0;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/n;Z)Le/b/a/y/x/k0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Z)",
            "Le/b/a/y/x/k0<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Le/b/a/y/x/u0;->a(Z)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/b/a/y/x/k0;

    return-object p1
.end method

.method public final a(Z)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/k0<",
            "*>;>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Le/b/a/y/x/u0;->b:Ljava/util/Map;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Le/b/a/y/x/u0;->a:Ljava/util/Map;

    :goto_0
    return-object p1
.end method

.method public a(Le/b/a/y/n;Le/b/a/y/x/k0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/k0<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-virtual {p2}, Le/b/a/y/x/k0;->h()Z

    move-result v0

    invoke-virtual {p0, v0}, Le/b/a/y/x/u0;->a(Z)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Le/b/a/y/n;Le/b/a/y/x/k0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/k0<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Le/b/a/y/x/k0;->h()Z

    move-result v0

    invoke-virtual {p0, v0}, Le/b/a/y/x/u0;->a(Z)Ljava/util/Map;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
