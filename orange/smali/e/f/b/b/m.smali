.class public Le/f/b/b/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/b/b/m0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/b/b/m0<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "Le/f/b/b/p;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/ref/ReferenceQueue;Le/f/b/b/p;)Le/f/b/b/m0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "Ljava/lang/Object;",
            ">;",
            "Le/f/b/b/p;",
            ")",
            "Le/f/b/b/m0<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Le/f/b/b/p;",
            ">;"
        }
    .end annotation

    return-object p0
.end method

.method public bridge synthetic a(Ljava/lang/ref/ReferenceQueue;Le/f/b/b/r;)Le/f/b/b/m0;
    .locals 0

    .line 1
    check-cast p2, Le/f/b/b/p;

    invoke-virtual {p0, p1, p2}, Le/f/b/b/m;->a(Ljava/lang/ref/ReferenceQueue;Le/f/b/b/p;)Le/f/b/b/m0;

    return-object p0
.end method

.method public a()Le/f/b/b/p;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic a()Le/f/b/b/r;
    .locals 1

    .line 2
    invoke-virtual {p0}, Le/f/b/b/m;->a()Le/f/b/b/p;

    move-result-object v0

    return-object v0
.end method

.method public clear()V
    .locals 0

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
