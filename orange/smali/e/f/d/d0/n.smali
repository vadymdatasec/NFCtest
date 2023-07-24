.class public final Le/f/d/d0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Le/f/d/r<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Le/f/d/r<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/d/d0/n;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Le/f/d/e0/a;)Le/f/d/d0/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/d/e0/a<",
            "TT;>;)",
            "Le/f/d/d0/s<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Le/f/d/e0/a;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Le/f/d/e0/a;->a()Ljava/lang/Class;

    move-result-object p1

    .line 3
    iget-object v1, p0, Le/f/d/d0/n;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/d/r;

    if-eqz v1, :cond_0

    .line 4
    new-instance p1, Le/f/d/d0/f;

    invoke-direct {p1, p0, v1, v0}, Le/f/d/d0/f;-><init>(Le/f/d/d0/n;Le/f/d/r;Ljava/lang/reflect/Type;)V

    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Le/f/d/d0/n;->a(Ljava/lang/Class;)Le/f/d/d0/s;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    .line 6
    :cond_1
    invoke-virtual {p0, p1}, Le/f/d/d0/n;->b(Ljava/lang/Class;)Le/f/d/d0/s;

    move-result-object v1

    if-eqz v1, :cond_2

    return-object v1

    .line 7
    :cond_2
    invoke-virtual {p0, v0, p1}, Le/f/d/d0/n;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;)Le/f/d/d0/s;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/Class;)Le/f/d/d0/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "Le/f/d/d0/s<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ljava/lang/Class;

    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->isAccessible()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 11
    :cond_0
    new-instance v0, Le/f/d/d0/g;

    invoke-direct {v0, p0, p1}, Le/f/d/d0/g;-><init>(Le/f/d/d0/n;Ljava/lang/reflect/Constructor;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Ljava/lang/reflect/Type;Ljava/lang/Class;)Le/f/d/d0/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "Le/f/d/d0/s<",
            "TT;>;"
        }
    .end annotation

    .line 12
    new-instance v0, Le/f/d/d0/m;

    invoke-direct {v0, p0, p2, p1}, Le/f/d/d0/m;-><init>(Le/f/d/d0/n;Ljava/lang/Class;Ljava/lang/reflect/Type;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Class;)Le/f/d/d0/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "Le/f/d/d0/s<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    const-class v0, Ljava/util/SortedSet;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance p1, Le/f/d/d0/h;

    invoke-direct {p1, p0}, Le/f/d/d0/h;-><init>(Le/f/d/d0/n;)V

    return-object p1

    .line 4
    :cond_0
    const-class v0, Ljava/util/Set;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    new-instance p1, Le/f/d/d0/i;

    invoke-direct {p1, p0}, Le/f/d/d0/i;-><init>(Le/f/d/d0/n;)V

    return-object p1

    .line 6
    :cond_1
    const-class v0, Ljava/util/Queue;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    new-instance p1, Le/f/d/d0/j;

    invoke-direct {p1, p0}, Le/f/d/d0/j;-><init>(Le/f/d/d0/n;)V

    return-object p1

    .line 8
    :cond_2
    new-instance p1, Le/f/d/d0/k;

    invoke-direct {p1, p0}, Le/f/d/d0/k;-><init>(Le/f/d/d0/n;)V

    return-object p1

    .line 9
    :cond_3
    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 10
    new-instance p1, Le/f/d/d0/l;

    invoke-direct {p1, p0}, Le/f/d/d0/l;-><init>(Le/f/d/d0/n;)V

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/d/d0/n;->a:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
