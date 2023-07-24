.class public Lc/b/k/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc/b/k/m;

.field public final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Lc/b/k/q;->b(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lc/b/k/p;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lc/b/k/m;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 4
    invoke-static {p1, p2}, Lc/b/k/q;->b(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Lc/b/k/m;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    .line 5
    iput p2, p0, Lc/b/k/p;->b:I

    return-void
.end method


# virtual methods
.method public a(I)Lc/b/k/p;
    .locals 2

    .line 3
    iget-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-object v1, v0, Lc/b/k/m;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Lc/b/k/m;->h:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public a(ILandroid/content/DialogInterface$OnClickListener;)Lc/b/k/p;
    .locals 2

    .line 5
    iget-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-object v1, v0, Lc/b/k/m;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Lc/b/k/m;->l:Ljava/lang/CharSequence;

    .line 6
    iget-object p1, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iput-object p2, p1, Lc/b/k/m;->n:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public a(Landroid/content/DialogInterface$OnKeyListener;)Lc/b/k/p;
    .locals 1

    .line 7
    iget-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iput-object p1, v0, Lc/b/k/m;->u:Landroid/content/DialogInterface$OnKeyListener;

    return-object p0
.end method

.method public a(Landroid/graphics/drawable/Drawable;)Lc/b/k/p;
    .locals 1

    .line 4
    iget-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iput-object p1, v0, Lc/b/k/m;->d:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public a(Landroid/view/View;)Lc/b/k/p;
    .locals 1

    .line 2
    iget-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iput-object p1, v0, Lc/b/k/m;->g:Landroid/view/View;

    return-object p0
.end method

.method public a(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Lc/b/k/p;
    .locals 1

    .line 10
    iget-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iput-object p1, v0, Lc/b/k/m;->w:Landroid/widget/ListAdapter;

    .line 11
    iput-object p3, v0, Lc/b/k/m;->x:Landroid/content/DialogInterface$OnClickListener;

    .line 12
    iput p2, v0, Lc/b/k/m;->I:I

    const/4 p1, 0x1

    .line 13
    iput-boolean p1, v0, Lc/b/k/m;->H:Z

    return-object p0
.end method

.method public a(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Lc/b/k/p;
    .locals 1

    .line 8
    iget-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iput-object p1, v0, Lc/b/k/m;->w:Landroid/widget/ListAdapter;

    .line 9
    iput-object p2, v0, Lc/b/k/m;->x:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public a(Ljava/lang/CharSequence;)Lc/b/k/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iput-object p1, v0, Lc/b/k/m;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public a()Lc/b/k/q;
    .locals 3

    .line 14
    new-instance v0, Lc/b/k/q;

    iget-object v1, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-object v1, v1, Lc/b/k/m;->a:Landroid/content/Context;

    iget v2, p0, Lc/b/k/p;->b:I

    invoke-direct {v0, v1, v2}, Lc/b/k/q;-><init>(Landroid/content/Context;I)V

    .line 15
    iget-object v1, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-object v2, v0, Lc/b/k/q;->d:Landroidx/appcompat/app/AlertController;

    invoke-virtual {v1, v2}, Lc/b/k/m;->a(Landroidx/appcompat/app/AlertController;)V

    .line 16
    iget-object v1, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-boolean v1, v1, Lc/b/k/m;->r:Z

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 17
    iget-object v1, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-boolean v1, v1, Lc/b/k/m;->r:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 19
    :cond_0
    iget-object v1, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-object v1, v1, Lc/b/k/m;->s:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 20
    iget-object v1, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-object v1, v1, Lc/b/k/m;->t:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 21
    iget-object v1, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-object v1, v1, Lc/b/k/m;->u:Landroid/content/DialogInterface$OnKeyListener;

    if-eqz v1, :cond_1

    .line 22
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    :cond_1
    return-object v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-object v0, v0, Lc/b/k/m;->a:Landroid/content/Context;

    return-object v0
.end method

.method public b(I)Lc/b/k/p;
    .locals 2

    .line 2
    iget-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-object v1, v0, Lc/b/k/m;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Lc/b/k/m;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public b(ILandroid/content/DialogInterface$OnClickListener;)Lc/b/k/p;
    .locals 2

    .line 3
    iget-object v0, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iget-object v1, v0, Lc/b/k/m;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Lc/b/k/m;->i:Ljava/lang/CharSequence;

    .line 4
    iget-object p1, p0, Lc/b/k/p;->a:Lc/b/k/m;

    iput-object p2, p1, Lc/b/k/m;->k:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method
