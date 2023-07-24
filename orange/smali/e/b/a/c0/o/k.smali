.class public abstract Le/b/a/c0/o/k;
.super Le/b/a/c0/o/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "Z:",
        "Ljava/lang/Object;",
        ">",
        "Le/b/a/c0/o/a<",
        "TZ;>;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static g:I


# instance fields
.field public final b:Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final c:Le/b/a/c0/o/j;

.field public d:Landroid/view/View$OnAttachStateChangeListener;

.field public e:Z

.field public f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Le/b/a/o;->glide_custom_view_target_tag:I

    sput v0, Le/b/a/c0/o/k;->g:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Le/b/a/c0/o/a;-><init>()V

    .line 2
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Landroid/view/View;

    iput-object v0, p0, Le/b/a/c0/o/k;->b:Landroid/view/View;

    .line 3
    new-instance v0, Le/b/a/c0/o/j;

    invoke-direct {v0, p1}, Le/b/a/c0/o/j;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Le/b/a/c0/o/k;->c:Le/b/a/c0/o/j;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Le/b/a/c0/o/a;->a(Landroid/graphics/drawable/Drawable;)V

    .line 2
    invoke-virtual {p0}, Le/b/a/c0/o/k;->e()V

    return-void
.end method

.method public a(Le/b/a/c0/d;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Le/b/a/c0/o/k;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Le/b/a/c0/o/g;)V
    .locals 1

    .line 3
    iget-object v0, p0, Le/b/a/c0/o/k;->c:Le/b/a/c0/o/j;

    invoke-virtual {v0, p1}, Le/b/a/c0/o/j;->b(Le/b/a/c0/o/g;)V

    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2

    .line 5
    iget-object v0, p0, Le/b/a/c0/o/k;->b:Landroid/view/View;

    sget v1, Le/b/a/c0/o/k;->g:I

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public b(Le/b/a/c0/o/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/o/k;->c:Le/b/a/c0/o/j;

    invoke-virtual {v0, p1}, Le/b/a/c0/o/j;->a(Le/b/a/c0/o/g;)V

    return-void
.end method

.method public c()Le/b/a/c0/d;
    .locals 2

    .line 5
    invoke-virtual {p0}, Le/b/a/c0/o/k;->d()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    instance-of v1, v0, Le/b/a/c0/d;

    if-eqz v1, :cond_0

    .line 7
    check-cast v0, Le/b/a/c0/d;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You must not call setTag() on a view Glide is targeting"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public c(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Le/b/a/c0/o/a;->c(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Le/b/a/c0/o/k;->c:Le/b/a/c0/o/j;

    invoke-virtual {p1}, Le/b/a/c0/o/j;->b()V

    .line 3
    iget-boolean p1, p0, Le/b/a/c0/o/k;->e:Z

    if-nez p1, :cond_0

    .line 4
    invoke-virtual {p0}, Le/b/a/c0/o/k;->f()V

    :cond_0
    return-void
.end method

.method public final d()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/c0/o/k;->b:Landroid/view/View;

    sget v1, Le/b/a/c0/o/k;->g:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/c0/o/k;->d:Landroid/view/View$OnAttachStateChangeListener;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Le/b/a/c0/o/k;->f:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v1, p0, Le/b/a/c0/o/k;->b:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Le/b/a/c0/o/k;->f:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/c0/o/k;->d:Landroid/view/View$OnAttachStateChangeListener;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Le/b/a/c0/o/k;->f:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v1, p0, Le/b/a/c0/o/k;->b:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Le/b/a/c0/o/k;->f:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Target for: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/c0/o/k;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
