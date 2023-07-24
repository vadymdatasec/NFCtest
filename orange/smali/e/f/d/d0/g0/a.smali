.class public final Le/f/d/d0/g0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/d/b0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/d/q;Le/f/d/e0/a;)Le/f/d/a0;
    .locals 2
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

    .line 1
    invoke-virtual {p2}, Le/f/d/e0/a;->b()Ljava/lang/reflect/Type;

    move-result-object p2

    .line 2
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    if-nez v0, :cond_1

    instance-of v0, p2, Ljava/lang/Class;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_1
    invoke-static {p2}, Le/f/d/d0/e;->e(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p2

    .line 4
    invoke-static {p2}, Le/f/d/e0/a;->a(Ljava/lang/reflect/Type;)Le/f/d/e0/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/f/d/q;->a(Le/f/d/e0/a;)Le/f/d/a0;

    move-result-object v0

    .line 5
    new-instance v1, Le/f/d/d0/g0/b;

    invoke-static {p2}, Le/f/d/d0/e;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-direct {v1, p1, v0, p2}, Le/f/d/d0/g0/b;-><init>(Le/f/d/q;Le/f/d/a0;Ljava/lang/Class;)V

    return-object v1
.end method
