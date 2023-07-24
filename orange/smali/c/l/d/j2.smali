.class public Lc/l/d/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/fragment/app/Fragment;

.field public final synthetic c:Landroidx/fragment/app/Fragment;

.field public final synthetic d:Z

.field public final synthetic e:Lc/e/b;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:Lc/l/d/x2;

.field public final synthetic h:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLc/e/b;Landroid/view/View;Lc/l/d/x2;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/j2;->b:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Lc/l/d/j2;->c:Landroidx/fragment/app/Fragment;

    iput-boolean p3, p0, Lc/l/d/j2;->d:Z

    iput-object p4, p0, Lc/l/d/j2;->e:Lc/e/b;

    iput-object p5, p0, Lc/l/d/j2;->f:Landroid/view/View;

    iput-object p6, p0, Lc/l/d/j2;->g:Lc/l/d/x2;

    iput-object p7, p0, Lc/l/d/j2;->h:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/l/d/j2;->b:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Lc/l/d/j2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v2, p0, Lc/l/d/j2;->d:Z

    iget-object v3, p0, Lc/l/d/j2;->e:Lc/e/b;

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lc/l/d/n2;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLc/e/b;Z)V

    .line 2
    iget-object v0, p0, Lc/l/d/j2;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lc/l/d/j2;->g:Lc/l/d/x2;

    iget-object v2, p0, Lc/l/d/j2;->h:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, v2}, Lc/l/d/x2;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method
