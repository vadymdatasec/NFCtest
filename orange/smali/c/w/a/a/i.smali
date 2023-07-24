.class public Lc/w/a/a/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/animation/TypeEvaluator<",
        "[",
        "Lc/h/g/d;",
        ">;"
    }
.end annotation


# instance fields
.field public a:[Lc/h/g/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F[Lc/h/g/d;[Lc/h/g/d;)[Lc/h/g/d;
    .locals 4

    .line 1
    invoke-static {p2, p3}, Lc/h/g/e;->a([Lc/h/g/d;[Lc/h/g/d;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lc/w/a/a/i;->a:[Lc/h/g/d;

    invoke-static {v0, p2}, Lc/h/g/e;->a([Lc/h/g/d;[Lc/h/g/d;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {p2}, Lc/h/g/e;->a([Lc/h/g/d;)[Lc/h/g/d;

    move-result-object v0

    iput-object v0, p0, Lc/w/a/a/i;->a:[Lc/h/g/d;

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_1

    .line 5
    iget-object v1, p0, Lc/w/a/a/i;->a:[Lc/h/g/d;

    aget-object v1, v1, v0

    aget-object v2, p2, v0

    aget-object v3, p3, v0

    invoke-virtual {v1, v2, v3, p1}, Lc/h/g/d;->a(Lc/h/g/d;Lc/h/g/d;F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Lc/w/a/a/i;->a:[Lc/h/g/d;

    return-object p1

    .line 7
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Can\'t interpolate between two incompatible pathData"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, [Lc/h/g/d;

    check-cast p3, [Lc/h/g/d;

    invoke-virtual {p0, p1, p2, p3}, Lc/w/a/a/i;->a(F[Lc/h/g/d;[Lc/h/g/d;)[Lc/h/g/d;

    move-result-object p1

    return-object p1
.end method
