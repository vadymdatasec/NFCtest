.class public final Le/f/d/d0/g0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/d/b0;


# instance fields
.field public final b:Le/f/d/d0/n;


# direct methods
.method public constructor <init>(Le/f/d/d0/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/d/d0/g0/d;->b:Le/f/d/d0/n;

    return-void
.end method


# virtual methods
.method public a(Le/f/d/q;Le/f/d/e0/a;)Le/f/d/a0;
    .locals 6
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

    move-result-object v0

    .line 2
    invoke-virtual {p2}, Le/f/d/e0/a;->a()Ljava/lang/Class;

    move-result-object v1

    .line 3
    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-static {v0, v1}, Le/f/d/d0/e;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v3

    .line 5
    invoke-static {v3}, Le/f/d/e0/a;->a(Ljava/lang/reflect/Type;)Le/f/d/e0/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/f/d/q;->a(Le/f/d/e0/a;)Le/f/d/a0;

    move-result-object v4

    .line 6
    iget-object v0, p0, Le/f/d/d0/g0/d;->b:Le/f/d/d0/n;

    invoke-virtual {v0, p2}, Le/f/d/d0/n;->a(Le/f/d/e0/a;)Le/f/d/d0/s;

    move-result-object v5

    .line 7
    new-instance p2, Le/f/d/d0/g0/c;

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Le/f/d/d0/g0/c;-><init>(Le/f/d/d0/g0/d;Le/f/d/q;Ljava/lang/reflect/Type;Le/f/d/a0;Le/f/d/d0/s;)V

    return-object p2
.end method
