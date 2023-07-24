.class public Lc/h/g/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/h/g/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/h/g/o<",
        "Lc/h/k/o;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lc/h/g/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/h/k/o;)I
    .locals 0

    .line 2
    invoke-virtual {p1}, Lc/h/k/o;->d()I

    move-result p1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lc/h/k/o;

    invoke-virtual {p0, p1}, Lc/h/g/m;->a(Lc/h/k/o;)I

    move-result p1

    return p1
.end method

.method public b(Lc/h/k/o;)Z
    .locals 0

    .line 2
    invoke-virtual {p1}, Lc/h/k/o;->e()Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lc/h/k/o;

    invoke-virtual {p0, p1}, Lc/h/g/m;->b(Lc/h/k/o;)Z

    move-result p1

    return p1
.end method
