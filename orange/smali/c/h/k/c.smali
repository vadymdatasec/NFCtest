.class public Lc/h/k/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc/h/k/p;

.field public final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lc/h/k/p;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/h/k/c;->a:Lc/h/k/p;

    .line 3
    iput-object p2, p0, Lc/h/k/c;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 3
    iget-object v0, p0, Lc/h/k/c;->a:Lc/h/k/p;

    .line 4
    iget-object v1, p0, Lc/h/k/c;->b:Landroid/os/Handler;

    new-instance v2, Lc/h/k/b;

    invoke-direct {v2, p0, v0, p1}, Lc/h/k/b;-><init>(Lc/h/k/c;Lc/h/k/p;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(Landroid/graphics/Typeface;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/h/k/c;->a:Lc/h/k/p;

    .line 2
    iget-object v1, p0, Lc/h/k/c;->b:Landroid/os/Handler;

    new-instance v2, Lc/h/k/a;

    invoke-direct {v2, p0, v0, p1}, Lc/h/k/a;-><init>(Lc/h/k/c;Lc/h/k/p;Landroid/graphics/Typeface;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a(Lc/h/k/l;)V
    .locals 1

    .line 5
    invoke-virtual {p1}, Lc/h/k/l;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    iget-object p1, p1, Lc/h/k/l;->a:Landroid/graphics/Typeface;

    invoke-virtual {p0, p1}, Lc/h/k/c;->a(Landroid/graphics/Typeface;)V

    goto :goto_0

    .line 7
    :cond_0
    iget p1, p1, Lc/h/k/l;->b:I

    invoke-virtual {p0, p1}, Lc/h/k/c;->a(I)V

    :goto_0
    return-void
.end method
