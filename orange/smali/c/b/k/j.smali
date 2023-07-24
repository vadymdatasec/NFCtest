.class public Lc/b/k/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic b:Landroidx/appcompat/app/AlertController;

.field public final synthetic c:Lc/b/k/m;


# direct methods
.method public constructor <init>(Lc/b/k/m;Landroidx/appcompat/app/AlertController;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/j;->c:Lc/b/k/m;

    iput-object p2, p0, Lc/b/k/j;->b:Landroidx/appcompat/app/AlertController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lc/b/k/j;->c:Lc/b/k/m;

    iget-object p1, p1, Lc/b/k/m;->x:Landroid/content/DialogInterface$OnClickListener;

    iget-object p2, p0, Lc/b/k/j;->b:Landroidx/appcompat/app/AlertController;

    iget-object p2, p2, Landroidx/appcompat/app/AlertController;->b:Lc/b/k/p0;

    invoke-interface {p1, p2, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 2
    iget-object p1, p0, Lc/b/k/j;->c:Lc/b/k/m;

    iget-boolean p1, p1, Lc/b/k/m;->H:Z

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lc/b/k/j;->b:Landroidx/appcompat/app/AlertController;

    iget-object p1, p1, Landroidx/appcompat/app/AlertController;->b:Lc/b/k/p0;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
