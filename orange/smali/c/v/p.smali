.class public Lc/v/p;
.super Lc/v/l0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/view/View;


# direct methods
.method public constructor <init>(Lc/v/r;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/v/p;->a:Landroid/view/View;

    invoke-direct {p0}, Lc/v/l0;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lc/v/k0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/v/p;->a:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lc/v/j1;->a(Landroid/view/View;F)V

    .line 2
    iget-object v0, p0, Lc/v/p;->a:Landroid/view/View;

    invoke-static {v0}, Lc/v/j1;->a(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1, p0}, Lc/v/k0;->b(Lc/v/j0;)Lc/v/k0;

    return-void
.end method
