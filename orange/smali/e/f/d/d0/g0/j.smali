.class public final Le/f/d/d0/g0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/d/b0;


# instance fields
.field public final b:Le/f/d/d0/n;

.field public final c:Z


# direct methods
.method public constructor <init>(Le/f/d/d0/n;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/d/d0/g0/j;->b:Le/f/d/d0/n;

    .line 3
    iput-boolean p2, p0, Le/f/d/d0/g0/j;->c:Z

    return-void
.end method

.method public static synthetic a(Le/f/d/d0/g0/j;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Le/f/d/d0/g0/j;->c:Z

    return p0
.end method


# virtual methods
.method public a(Le/f/d/q;Le/f/d/e0/a;)Le/f/d/a0;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/d/q;",
            "Le/f/d/e0/a<",
            "TT;>;)",
            "Le/f/d/a0<",
            "TT;>;"
        }
    .end annotation

    .line 2
    invoke-virtual {p2}, Le/f/d/e0/a;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 3
    invoke-virtual {p2}, Le/f/d/e0/a;->a()Ljava/lang/Class;

    move-result-object v1

    .line 4
    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_0
    invoke-static {v0}, Le/f/d/d0/e;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    .line 6
    invoke-static {v0, v1}, Le/f/d/d0/e;->b(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    .line 7
    aget-object v2, v0, v1

    invoke-virtual {p0, p1, v2}, Le/f/d/d0/g0/j;->a(Le/f/d/q;Ljava/lang/reflect/Type;)Le/f/d/a0;

    move-result-object v7

    const/4 v2, 0x1

    .line 8
    aget-object v3, v0, v2

    invoke-static {v3}, Le/f/d/e0/a;->a(Ljava/lang/reflect/Type;)Le/f/d/e0/a;

    move-result-object v3

    invoke-virtual {p1, v3}, Le/f/d/q;->a(Le/f/d/e0/a;)Le/f/d/a0;

    move-result-object v9

    .line 9
    iget-object v3, p0, Le/f/d/d0/g0/j;->b:Le/f/d/d0/n;

    invoke-virtual {v3, p2}, Le/f/d/d0/n;->a(Le/f/d/e0/a;)Le/f/d/d0/s;

    move-result-object v10

    .line 10
    new-instance p2, Le/f/d/d0/g0/i;

    aget-object v6, v0, v1

    aget-object v8, v0, v2

    move-object v3, p2

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v3 .. v10}, Le/f/d/d0/g0/i;-><init>(Le/f/d/d0/g0/j;Le/f/d/q;Ljava/lang/reflect/Type;Le/f/d/a0;Ljava/lang/reflect/Type;Le/f/d/a0;Le/f/d/d0/s;)V

    return-object p2
.end method

.method public final a(Le/f/d/q;Ljava/lang/reflect/Type;)Le/f/d/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/q;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Le/f/d/a0<",
            "*>;"
        }
    .end annotation

    .line 11
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p2, v0, :cond_1

    const-class v0, Ljava/lang/Boolean;

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Le/f/d/e0/a;->a(Ljava/lang/reflect/Type;)Le/f/d/e0/a;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/f/d/q;->a(Le/f/d/e0/a;)Le/f/d/a0;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p1, Le/f/d/d0/g0/d1;->f:Le/f/d/a0;

    :goto_1
    return-object p1
.end method
