.class public Lc/b/q/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lc/b/q/u0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Lc/b/q/t0;Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lc/b/q/u0;",
            ">;",
            "Landroid/graphics/Typeface;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lc/b/q/s0;->b:Ljava/lang/ref/WeakReference;

    .line 3
    iput-object p3, p0, Lc/b/q/s0;->c:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/s0;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/b/q/u0;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lc/b/q/s0;->c:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lc/b/q/u0;->a(Landroid/graphics/Typeface;)V

    return-void
.end method
