.class public final Le/f/d/d0/g0/o0;
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
    .locals 0
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
    invoke-virtual {p2}, Le/f/d/e0/a;->a()Ljava/lang/Class;

    move-result-object p1

    .line 2
    const-class p2, Ljava/lang/Enum;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-class p2, Ljava/lang/Enum;

    if-ne p1, p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    move-result p2

    if-nez p2, :cond_1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    .line 5
    :cond_1
    new-instance p2, Le/f/d/d0/g0/c1;

    invoke-direct {p2, p1}, Le/f/d/d0/g0/c1;-><init>(Ljava/lang/Class;)V

    return-object p2

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
