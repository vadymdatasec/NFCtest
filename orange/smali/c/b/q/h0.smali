.class public Lc/b/q/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/b/q/p0;
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public b:Lc/b/k/q;

.field public c:Landroid/widget/ListAdapter;

.field public d:Ljava/lang/CharSequence;

.field public final synthetic e:Lc/b/q/q0;


# direct methods
.method public constructor <init>(Lc/b/q/q0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/h0;->e:Lc/b/q/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set horizontal offset for MODE_DIALOG, ignoring"

    .line 17
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public a(II)V
    .locals 3

    .line 3
    iget-object v0, p0, Lc/b/q/h0;->c:Landroid/widget/ListAdapter;

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance v0, Lc/b/k/p;

    iget-object v1, p0, Lc/b/q/h0;->e:Lc/b/q/q0;

    invoke-virtual {v1}, Lc/b/q/q0;->getPopupContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/b/k/p;-><init>(Landroid/content/Context;)V

    .line 5
    iget-object v1, p0, Lc/b/q/h0;->d:Ljava/lang/CharSequence;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v0, v1}, Lc/b/k/p;->a(Ljava/lang/CharSequence;)Lc/b/k/p;

    .line 7
    :cond_1
    iget-object v1, p0, Lc/b/q/h0;->c:Landroid/widget/ListAdapter;

    iget-object v2, p0, Lc/b/q/h0;->e:Lc/b/q/q0;

    .line 8
    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v2

    .line 9
    invoke-virtual {v0, v1, v2, p0}, Lc/b/k/p;->a(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Lc/b/k/p;

    .line 10
    invoke-virtual {v0}, Lc/b/k/p;->a()Lc/b/k/q;

    move-result-object v0

    iput-object v0, p0, Lc/b/q/h0;->b:Lc/b/k/q;

    .line 11
    invoke-virtual {v0}, Lc/b/k/q;->b()Landroid/widget/ListView;

    move-result-object v0

    .line 12
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_2

    .line 13
    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setTextDirection(I)V

    .line 14
    invoke-virtual {v0, p2}, Landroid/widget/ListView;->setTextAlignment(I)V

    .line 15
    :cond_2
    iget-object p1, p0, Lc/b/q/h0;->b:Lc/b/k/q;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set popup background for MODE_DIALOG, ignoring"

    .line 16
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public a(Landroid/widget/ListAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/h0;->c:Landroid/widget/ListAdapter;

    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lc/b/q/h0;->d:Ljava/lang/CharSequence;

    return-void
.end method

.method public b(I)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set vertical offset for MODE_DIALOG, ignoring"

    .line 2
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/h0;->b:Lc/b/k/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c(I)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"

    .line 1
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public dismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/h0;->b:Lc/b/k/q;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lc/b/q/h0;->b:Lc/b/k/q;

    :cond_0
    return-void
.end method

.method public e()Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/h0;->d:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 1
    iget-object p1, p0, Lc/b/q/h0;->e:Lc/b/q/q0;

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setSelection(I)V

    .line 2
    iget-object p1, p0, Lc/b/q/h0;->e:Lc/b/q/q0;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lc/b/q/h0;->e:Lc/b/q/q0;

    const/4 v0, 0x0

    iget-object v1, p0, Lc/b/q/h0;->c:Landroid/widget/ListAdapter;

    invoke-interface {v1, p2}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v1

    invoke-virtual {p1, v0, p2, v1, v2}, Landroid/widget/Spinner;->performItemClick(Landroid/view/View;IJ)Z

    .line 4
    :cond_0
    invoke-virtual {p0}, Lc/b/q/h0;->dismiss()V

    return-void
.end method
