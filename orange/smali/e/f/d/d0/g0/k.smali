.class public final Le/f/d/d0/g0/k;
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
    invoke-virtual {p2}, Le/f/d/e0/a;->a()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    .line 2
    new-instance p2, Le/f/d/d0/g0/m;

    invoke-direct {p2, p1, v1}, Le/f/d/d0/g0/m;-><init>(Le/f/d/q;Le/f/d/d0/g0/k;)V

    return-object p2

    :cond_0
    return-object v1
.end method
