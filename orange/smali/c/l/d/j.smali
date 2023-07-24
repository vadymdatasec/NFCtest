.class public Lc/l/d/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/h/j/b;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Landroid/view/ViewGroup;

.field public final synthetic c:Lc/l/d/o;


# direct methods
.method public constructor <init>(Lc/l/d/r;Landroid/view/View;Landroid/view/ViewGroup;Lc/l/d/o;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/l/d/j;->a:Landroid/view/View;

    iput-object p3, p0, Lc/l/d/j;->b:Landroid/view/ViewGroup;

    iput-object p4, p0, Lc/l/d/j;->c:Lc/l/d/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/j;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 2
    iget-object v0, p0, Lc/l/d/j;->b:Landroid/view/ViewGroup;

    iget-object v1, p0, Lc/l/d/j;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 3
    iget-object v0, p0, Lc/l/d/j;->c:Lc/l/d/o;

    invoke-virtual {v0}, Lc/l/d/p;->a()V

    return-void
.end method
