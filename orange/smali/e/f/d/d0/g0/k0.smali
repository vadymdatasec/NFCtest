.class public final Le/f/d/d0/g0/k0;
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
    .locals 1
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

    move-result-object p2

    const-class v0, Ljava/sql/Timestamp;

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    const-class p2, Ljava/util/Date;

    invoke-virtual {p1, p2}, Le/f/d/q;->a(Ljava/lang/Class;)Le/f/d/a0;

    move-result-object p1

    .line 3
    new-instance p2, Le/f/d/d0/g0/j0;

    invoke-direct {p2, p0, p1}, Le/f/d/d0/g0/j0;-><init>(Le/f/d/d0/g0/k0;Le/f/d/a0;)V

    return-object p2
.end method
