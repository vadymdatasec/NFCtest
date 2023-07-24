.class public Lc/b/q/t0;
.super Lc/h/f/i/r;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lc/b/q/u0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lc/b/q/u0;II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/h/f/i/r;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lc/b/q/t0;->a:Ljava/lang/ref/WeakReference;

    .line 3
    iput p2, p0, Lc/b/q/t0;->b:I

    .line 4
    iput p3, p0, Lc/b/q/t0;->c:I

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(Landroid/graphics/Typeface;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/b/q/t0;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/b/q/u0;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_2

    .line 3
    iget v1, p0, Lc/b/q/t0;->b:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    .line 4
    iget v2, p0, Lc/b/q/t0;->c:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, v1, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    .line 5
    :cond_2
    new-instance v1, Lc/b/q/s0;

    iget-object v2, p0, Lc/b/q/t0;->a:Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0, v2, p1}, Lc/b/q/s0;-><init>(Lc/b/q/t0;Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V

    invoke-virtual {v0, v1}, Lc/b/q/u0;->a(Ljava/lang/Runnable;)V

    return-void
.end method
