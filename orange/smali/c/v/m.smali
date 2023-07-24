.class public Lc/v/m;
.super Lc/v/l0;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final synthetic b:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Lc/v/o;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/v/m;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lc/v/l0;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lc/v/m;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lc/v/k0;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/v/m;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lc/v/z0;->a(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public b(Lc/v/k0;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/v/m;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lc/v/z0;->a(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public d(Lc/v/k0;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/v/m;->a:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/v/m;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lc/v/z0;->a(Landroid/view/ViewGroup;Z)V

    .line 3
    :cond_0
    invoke-virtual {p1, p0}, Lc/v/k0;->b(Lc/v/j0;)Lc/v/k0;

    return-void
.end method
