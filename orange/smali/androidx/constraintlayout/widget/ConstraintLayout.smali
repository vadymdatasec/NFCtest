.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/widget/ConstraintLayout$a;
    }
.end annotation


# instance fields
.field public b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/f/b/b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/f/a/l/i;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lc/f/a/l/j;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Z

.field public k:I

.field public l:Lc/f/b/f;

.field public m:I

.field public n:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public o:I

.field public p:I

.field public q:Lc/f/a/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x64

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    .line 5
    new-instance p1, Lc/f/a/l/j;

    invoke-direct {p1}, Lc/f/a/l/j;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 7
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const p1, 0x7fffffff

    .line 8
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    .line 9
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    const/4 p1, 0x7

    .line 11
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc/f/b/f;

    const/4 v0, -0x1

    .line 13
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    .line 14
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    .line 15
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    .line 16
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    .line 17
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 18
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x64

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    .line 22
    new-instance p1, Lc/f/a/l/j;

    invoke-direct {p1}, Lc/f/a/l/j;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    const/4 p1, 0x0

    .line 23
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 24
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const p1, 0x7fffffff

    .line 25
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    .line 26
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 p1, 0x1

    .line 27
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    const/4 p1, 0x7

    .line 28
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    const/4 p1, 0x0

    .line 29
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc/f/b/f;

    const/4 p1, -0x1

    .line 30
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    .line 32
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    .line 33
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    .line 34
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    .line 37
    new-instance p1, Ljava/util/ArrayList;

    const/4 p3, 0x4

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    .line 38
    new-instance p1, Ljava/util/ArrayList;

    const/16 p3, 0x64

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    .line 39
    new-instance p1, Lc/f/a/l/j;

    invoke-direct {p1}, Lc/f/a/l/j;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    const/4 p1, 0x0

    .line 40
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 41
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const p1, 0x7fffffff

    .line 42
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    .line 43
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    const/4 p1, 0x7

    .line 45
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc/f/b/f;

    const/4 p1, -0x1

    .line 47
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    .line 48
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    .line 49
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    .line 50
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    .line 51
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(I)Lc/f/a/l/i;
    .locals 1

    if-nez p1, :cond_0

    .line 174
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    return-object p1

    .line 175
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    .line 176
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eq v0, p0, :cond_1

    .line 177
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-ne p1, p0, :cond_1

    .line 178
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_1
    if-ne v0, p0, :cond_2

    .line 179
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    return-object p1

    :cond_2
    if-nez v0, :cond_3

    const/4 p1, 0x0

    goto :goto_0

    .line 180
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lc/f/a/l/i;

    :goto_0
    return-object p1
.end method

.method public final a(Landroid/view/View;)Lc/f/a/l/i;
    .locals 0

    if-ne p1, p0, :cond_0

    .line 181
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 182
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lc/f/a/l/i;

    :goto_0
    return-object p1
.end method

.method public a(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    .line 9
    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 10
    check-cast p2, Ljava/lang/String;

    .line 11
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 12
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a()V
    .locals 26

    move-object/from16 v0, p0

    .line 37
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v1

    .line 38
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-eqz v1, :cond_1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_1

    .line 39
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 40
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v7

    .line 41
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v0, v3, v7, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v8, 0x2f

    .line 42
    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    if-eq v8, v4, :cond_0

    add-int/lit8 v8, v8, 0x1

    .line 43
    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 44
    :cond_0
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v6

    invoke-virtual {v6, v7}, Lc/f/a/l/i;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_3

    .line 45
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 46
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/view/View;)Lc/f/a/l/i;

    move-result-object v6

    if-nez v6, :cond_2

    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v6}, Lc/f/a/l/i;->E()V

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 48
    :cond_3
    iget v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    if-eq v5, v4, :cond_4

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v2, :cond_4

    .line 49
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 50
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v6

    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 51
    :cond_4
    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc/f/b/f;

    if-eqz v5, :cond_5

    .line 52
    invoke-virtual {v5, v0}, Lc/f/b/f;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 53
    :cond_5
    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v5}, Lc/f/a/l/v;->M()V

    .line 54
    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_6

    const/4 v6, 0x0

    :goto_4
    if-ge v6, v5, :cond_6

    .line 55
    iget-object v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc/f/b/b;

    .line 56
    invoke-virtual {v7, v0}, Lc/f/b/b;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_5
    if-ge v5, v2, :cond_7

    .line 57
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_7
    const/4 v5, 0x0

    :goto_6
    if-ge v5, v2, :cond_2d

    .line 58
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 59
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/view/View;)Lc/f/a/l/i;

    move-result-object v13

    if-nez v13, :cond_8

    goto/16 :goto_14

    .line 60
    :cond_8
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    move-object v14, v7

    check-cast v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 61
    invoke-virtual {v14}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a()V

    .line 62
    iget-boolean v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Z

    if-eqz v7, :cond_9

    .line 63
    iput-boolean v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Z

    goto :goto_7

    :cond_9
    if-eqz v1, :cond_a

    .line 64
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v7

    .line 65
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v0, v3, v7, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "id/"

    .line 66
    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    add-int/lit8 v8, v8, 0x3

    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 67
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v0, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v8

    invoke-virtual {v8, v7}, Lc/f/a/l/i;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_7

    :catch_1
    nop

    .line 68
    :cond_a
    :goto_7
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    invoke-virtual {v13, v7}, Lc/f/a/l/i;->o(I)V

    .line 69
    iget-boolean v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    if-eqz v7, :cond_b

    const/16 v7, 0x8

    .line 70
    invoke-virtual {v13, v7}, Lc/f/a/l/i;->o(I)V

    .line 71
    :cond_b
    invoke-virtual {v13, v6}, Lc/f/a/l/i;->a(Ljava/lang/Object;)V

    .line 72
    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v6, v13}, Lc/f/a/l/v;->b(Lc/f/a/l/i;)V

    .line 73
    iget-boolean v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-eqz v6, :cond_c

    iget-boolean v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    if-nez v6, :cond_d

    .line 74
    :cond_c
    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_d
    iget-boolean v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    const/16 v7, 0x11

    if-eqz v6, :cond_11

    .line 76
    check-cast v13, Lc/f/a/l/m;

    .line 77
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h0:I

    .line 78
    iget v8, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i0:I

    .line 79
    iget v9, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j0:F

    .line 80
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v10, v7, :cond_e

    .line 81
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I

    .line 82
    iget v8, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I

    .line 83
    iget v9, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F

    :cond_e
    const/high16 v7, -0x40800000    # -1.0f

    cmpl-float v7, v9, v7

    if-eqz v7, :cond_f

    .line 84
    invoke-virtual {v13, v9}, Lc/f/a/l/m;->e(F)V

    goto/16 :goto_14

    :cond_f
    if-eq v6, v4, :cond_10

    .line 85
    invoke-virtual {v13, v6}, Lc/f/a/l/m;->u(I)V

    goto/16 :goto_14

    :cond_10
    if-eq v8, v4, :cond_2c

    .line 86
    invoke-virtual {v13, v8}, Lc/f/a/l/m;->v(I)V

    goto/16 :goto_14

    .line 87
    :cond_11
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    if-ne v6, v4, :cond_12

    iget v6, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-eq v6, v4, :cond_12

    iget v6, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v6, v4, :cond_2c

    .line 88
    :cond_12
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a0:I

    .line 89
    iget v8, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b0:I

    .line 90
    iget v9, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c0:I

    .line 91
    iget v10, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d0:I

    .line 92
    iget v11, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e0:I

    .line 93
    iget v12, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f0:I

    .line 94
    iget v15, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g0:F

    .line 95
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v3, v7, :cond_17

    .line 96
    iget v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    .line 97
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    .line 98
    iget v9, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    .line 99
    iget v10, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    .line 100
    iget v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->t:I

    .line 101
    iget v8, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->v:I

    .line 102
    iget v15, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->z:F

    if-ne v3, v4, :cond_14

    if-ne v6, v4, :cond_14

    .line 103
    iget v11, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    if-eq v11, v4, :cond_13

    move/from16 v25, v11

    move v11, v6

    move/from16 v6, v25

    goto :goto_9

    .line 104
    :cond_13
    iget v11, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    if-eq v11, v4, :cond_14

    goto :goto_8

    :cond_14
    move v11, v6

    :goto_8
    move v6, v3

    :goto_9
    if-ne v9, v4, :cond_16

    if-ne v10, v4, :cond_16

    .line 105
    iget v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    if-eq v3, v4, :cond_15

    move v12, v7

    move/from16 v16, v8

    goto :goto_a

    .line 106
    :cond_15
    iget v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    if-eq v3, v4, :cond_16

    move v12, v7

    move/from16 v16, v8

    move v8, v11

    move v11, v15

    move v15, v3

    move v3, v9

    goto :goto_c

    :cond_16
    move v12, v7

    move/from16 v16, v8

    move v3, v9

    :goto_a
    move v8, v11

    goto :goto_b

    :cond_17
    move v3, v9

    move/from16 v16, v12

    move v12, v11

    :goto_b
    move v11, v15

    move v15, v10

    .line 107
    :goto_c
    iget v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    if-eq v7, v4, :cond_18

    .line 108
    invoke-virtual {v0, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v3

    if-eqz v3, :cond_24

    .line 109
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iget v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    invoke-virtual {v13, v3, v6, v7}, Lc/f/a/l/i;->a(Lc/f/a/l/i;FI)V

    goto/16 :goto_11

    :cond_18
    if-eq v6, v4, :cond_1a

    .line 110
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v9

    if-eqz v9, :cond_19

    .line 111
    sget-object v10, Lc/f/a/l/g$b;->c:Lc/f/a/l/g$b;

    iget v6, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object v7, v13

    move-object v8, v10

    move/from16 v17, v11

    move v11, v6

    invoke-virtual/range {v7 .. v12}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;Lc/f/a/l/i;Lc/f/a/l/g$b;II)V

    goto :goto_d

    :cond_19
    move/from16 v17, v11

    goto :goto_d

    :cond_1a
    move/from16 v17, v11

    if-eq v8, v4, :cond_1b

    .line 112
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v9

    if-eqz v9, :cond_1b

    .line 113
    sget-object v8, Lc/f/a/l/g$b;->c:Lc/f/a/l/g$b;

    sget-object v10, Lc/f/a/l/g$b;->e:Lc/f/a/l/g$b;

    iget v11, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object v7, v13

    invoke-virtual/range {v7 .. v12}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;Lc/f/a/l/i;Lc/f/a/l/g$b;II)V

    :cond_1b
    :goto_d
    if-eq v3, v4, :cond_1c

    .line 114
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v9

    if-eqz v9, :cond_1d

    .line 115
    sget-object v8, Lc/f/a/l/g$b;->e:Lc/f/a/l/g$b;

    sget-object v10, Lc/f/a/l/g$b;->c:Lc/f/a/l/g$b;

    iget v11, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object v7, v13

    move/from16 v12, v16

    invoke-virtual/range {v7 .. v12}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;Lc/f/a/l/i;Lc/f/a/l/g$b;II)V

    goto :goto_e

    :cond_1c
    if-eq v15, v4, :cond_1d

    .line 116
    invoke-virtual {v0, v15}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v9

    if-eqz v9, :cond_1d

    .line 117
    sget-object v10, Lc/f/a/l/g$b;->e:Lc/f/a/l/g$b;

    iget v11, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object v7, v13

    move-object v8, v10

    move/from16 v12, v16

    invoke-virtual/range {v7 .. v12}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;Lc/f/a/l/i;Lc/f/a/l/g$b;II)V

    .line 118
    :cond_1d
    :goto_e
    iget v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    if-eq v3, v4, :cond_1e

    .line 119
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v9

    if-eqz v9, :cond_1f

    .line 120
    sget-object v10, Lc/f/a/l/g$b;->d:Lc/f/a/l/g$b;

    iget v11, v14, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v12, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    move-object v7, v13

    move-object v8, v10

    invoke-virtual/range {v7 .. v12}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;Lc/f/a/l/i;Lc/f/a/l/g$b;II)V

    goto :goto_f

    .line 121
    :cond_1e
    iget v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    if-eq v3, v4, :cond_1f

    .line 122
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v9

    if-eqz v9, :cond_1f

    .line 123
    sget-object v8, Lc/f/a/l/g$b;->d:Lc/f/a/l/g$b;

    sget-object v10, Lc/f/a/l/g$b;->f:Lc/f/a/l/g$b;

    iget v11, v14, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v12, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    move-object v7, v13

    invoke-virtual/range {v7 .. v12}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;Lc/f/a/l/i;Lc/f/a/l/g$b;II)V

    .line 124
    :cond_1f
    :goto_f
    iget v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    if-eq v3, v4, :cond_20

    .line 125
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v9

    if-eqz v9, :cond_21

    .line 126
    sget-object v8, Lc/f/a/l/g$b;->f:Lc/f/a/l/g$b;

    sget-object v10, Lc/f/a/l/g$b;->d:Lc/f/a/l/g$b;

    iget v11, v14, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v12, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    move-object v7, v13

    invoke-virtual/range {v7 .. v12}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;Lc/f/a/l/i;Lc/f/a/l/g$b;II)V

    goto :goto_10

    .line 127
    :cond_20
    iget v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    if-eq v3, v4, :cond_21

    .line 128
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v9

    if-eqz v9, :cond_21

    .line 129
    sget-object v10, Lc/f/a/l/g$b;->f:Lc/f/a/l/g$b;

    iget v11, v14, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v12, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    move-object v7, v13

    move-object v8, v10

    invoke-virtual/range {v7 .. v12}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;Lc/f/a/l/i;Lc/f/a/l/g$b;II)V

    .line 130
    :cond_21
    :goto_10
    iget v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    if-eq v3, v4, :cond_22

    .line 131
    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v6, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 132
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Lc/f/a/l/i;

    move-result-object v6

    if-eqz v6, :cond_22

    if-eqz v3, :cond_22

    .line 133
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    instance-of v7, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    if-eqz v7, :cond_22

    .line 134
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    const/4 v7, 0x1

    .line 135
    iput-boolean v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    .line 136
    iput-boolean v7, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    .line 137
    sget-object v3, Lc/f/a/l/g$b;->g:Lc/f/a/l/g$b;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v18

    .line 138
    sget-object v3, Lc/f/a/l/g$b;->g:Lc/f/a/l/g$b;

    .line 139
    invoke-virtual {v6, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, -0x1

    .line 140
    sget-object v22, Lc/f/a/l/g$a;->c:Lc/f/a/l/g$a;

    const/16 v23, 0x0

    const/16 v24, 0x1

    invoke-virtual/range {v18 .. v24}, Lc/f/a/l/g;->a(Lc/f/a/l/g;IILc/f/a/l/g$a;IZ)Z

    .line 141
    sget-object v3, Lc/f/a/l/g$b;->d:Lc/f/a/l/g$b;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v3

    invoke-virtual {v3}, Lc/f/a/l/g;->j()V

    .line 142
    sget-object v3, Lc/f/a/l/g$b;->f:Lc/f/a/l/g$b;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v3

    invoke-virtual {v3}, Lc/f/a/l/g;->j()V

    :cond_22
    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v6, 0x0

    move/from16 v15, v17

    cmpl-float v7, v15, v6

    if-ltz v7, :cond_23

    cmpl-float v7, v15, v3

    if-eqz v7, :cond_23

    .line 143
    invoke-virtual {v13, v15}, Lc/f/a/l/i;->a(F)V

    .line 144
    :cond_23
    iget v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    cmpl-float v6, v7, v6

    if-ltz v6, :cond_24

    cmpl-float v3, v7, v3

    if-eqz v3, :cond_24

    .line 145
    invoke-virtual {v13, v7}, Lc/f/a/l/i;->c(F)V

    :cond_24
    :goto_11
    if-eqz v1, :cond_26

    .line 146
    iget v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    if-ne v3, v4, :cond_25

    iget v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    if-eq v3, v4, :cond_26

    .line 147
    :cond_25
    iget v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    invoke-virtual {v13, v3, v6}, Lc/f/a/l/i;->c(II)V

    .line 148
    :cond_26
    iget-boolean v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    if-nez v3, :cond_28

    .line 149
    iget v3, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v3, v4, :cond_27

    .line 150
    sget-object v3, Lc/f/a/l/i$a;->e:Lc/f/a/l/i$a;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/i$a;)V

    .line 151
    sget-object v3, Lc/f/a/l/g$b;->c:Lc/f/a/l/g$b;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v3

    iget v6, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v6, v3, Lc/f/a/l/g;->e:I

    .line 152
    sget-object v3, Lc/f/a/l/g$b;->e:Lc/f/a/l/g$b;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v3

    iget v6, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v6, v3, Lc/f/a/l/g;->e:I

    goto :goto_12

    .line 153
    :cond_27
    sget-object v3, Lc/f/a/l/i$a;->d:Lc/f/a/l/i$a;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/i$a;)V

    const/4 v3, 0x0

    .line 154
    invoke-virtual {v13, v3}, Lc/f/a/l/i;->p(I)V

    goto :goto_12

    .line 155
    :cond_28
    sget-object v3, Lc/f/a/l/i$a;->b:Lc/f/a/l/i$a;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/i$a;)V

    .line 156
    iget v3, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->p(I)V

    .line 157
    :goto_12
    iget-boolean v3, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-nez v3, :cond_2a

    .line 158
    iget v3, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v3, v4, :cond_29

    .line 159
    sget-object v3, Lc/f/a/l/i$a;->e:Lc/f/a/l/i$a;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->b(Lc/f/a/l/i$a;)V

    .line 160
    sget-object v3, Lc/f/a/l/g$b;->d:Lc/f/a/l/g$b;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v3

    iget v6, v14, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v6, v3, Lc/f/a/l/g;->e:I

    .line 161
    sget-object v3, Lc/f/a/l/g$b;->f:Lc/f/a/l/g$b;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v3

    iget v6, v14, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v6, v3, Lc/f/a/l/g;->e:I

    const/4 v3, 0x0

    goto :goto_13

    .line 162
    :cond_29
    sget-object v3, Lc/f/a/l/i$a;->d:Lc/f/a/l/i$a;

    invoke-virtual {v13, v3}, Lc/f/a/l/i;->b(Lc/f/a/l/i$a;)V

    const/4 v3, 0x0

    .line 163
    invoke-virtual {v13, v3}, Lc/f/a/l/i;->h(I)V

    goto :goto_13

    :cond_2a
    const/4 v3, 0x0

    .line 164
    sget-object v6, Lc/f/a/l/i$a;->b:Lc/f/a/l/i$a;

    invoke-virtual {v13, v6}, Lc/f/a/l/i;->b(Lc/f/a/l/i$a;)V

    .line 165
    iget v6, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v13, v6}, Lc/f/a/l/i;->h(I)V

    .line 166
    :goto_13
    iget-object v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    if-eqz v6, :cond_2b

    .line 167
    invoke-virtual {v13, v6}, Lc/f/a/l/i;->b(Ljava/lang/String;)V

    .line 168
    :cond_2b
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->D:F

    invoke-virtual {v13, v6}, Lc/f/a/l/i;->b(F)V

    .line 169
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    invoke-virtual {v13, v6}, Lc/f/a/l/i;->d(F)V

    .line 170
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:I

    invoke-virtual {v13, v6}, Lc/f/a/l/i;->i(I)V

    .line 171
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    invoke-virtual {v13, v6}, Lc/f/a/l/i;->n(I)V

    .line 172
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iget v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iget v8, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iget v9, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:F

    invoke-virtual {v13, v6, v7, v8, v9}, Lc/f/a/l/i;->a(IIIF)V

    .line 173
    iget v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iget v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iget v8, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iget v9, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    invoke-virtual {v13, v6, v7, v8, v9}, Lc/f/a/l/i;->b(IIIF)V

    :cond_2c
    :goto_14
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_6

    :cond_2d
    return-void
.end method

.method public final a(II)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 183
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v4

    add-int/2addr v3, v4

    .line 184
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v5

    add-int/2addr v4, v5

    .line 185
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_12

    .line 186
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 187
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    const/16 v10, 0x8

    if-ne v9, v10, :cond_0

    goto/16 :goto_a

    .line 188
    :cond_0
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 189
    iget-object v10, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lc/f/a/l/i;

    .line 190
    iget-boolean v11, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-nez v11, :cond_11

    iget-boolean v11, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-eqz v11, :cond_1

    goto/16 :goto_a

    .line 191
    :cond_1
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v11

    invoke-virtual {v10, v11}, Lc/f/a/l/i;->o(I)V

    .line 192
    iget v11, v9, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 193
    iget v12, v9, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 194
    iget-boolean v13, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    const/4 v14, -0x1

    const/4 v15, 0x1

    if-nez v13, :cond_4

    iget-boolean v6, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-nez v6, :cond_4

    if-nez v13, :cond_2

    iget v6, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    if-eq v6, v15, :cond_4

    :cond_2
    iget v6, v9, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-eq v6, v14, :cond_4

    iget-boolean v6, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-nez v6, :cond_3

    iget v6, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    if-eq v6, v15, :cond_4

    iget v6, v9, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v6, v14, :cond_3

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v6, 0x1

    :goto_2
    if-eqz v6, :cond_e

    const/4 v6, -0x2

    if-nez v11, :cond_5

    .line 195
    invoke-static {v1, v4, v6}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v13

    const/16 v16, 0x1

    goto :goto_4

    :cond_5
    if-ne v11, v14, :cond_6

    .line 196
    invoke-static {v1, v4, v14}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v13

    const/16 v16, 0x0

    goto :goto_4

    :cond_6
    if-ne v11, v6, :cond_7

    const/4 v13, 0x1

    goto :goto_3

    :cond_7
    const/4 v13, 0x0

    .line 197
    :goto_3
    invoke-static {v1, v4, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v16

    move/from16 v21, v16

    move/from16 v16, v13

    move/from16 v13, v21

    :goto_4
    if-nez v12, :cond_8

    .line 198
    invoke-static {v2, v3, v6}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v17

    move/from16 v15, v17

    const/16 v17, 0x1

    goto :goto_6

    :cond_8
    if-ne v12, v14, :cond_9

    .line 199
    invoke-static {v2, v3, v14}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v17

    move/from16 v15, v17

    const/16 v17, 0x0

    goto :goto_6

    :cond_9
    if-ne v12, v6, :cond_a

    const/16 v17, 0x1

    goto :goto_5

    :cond_a
    const/16 v17, 0x0

    .line 200
    :goto_5
    invoke-static {v2, v3, v12}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v18

    move/from16 v15, v18

    .line 201
    :goto_6
    invoke-virtual {v8, v13, v15}, Landroid/view/View;->measure(II)V

    .line 202
    iget-object v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:Lc/f/a/g;

    if-eqz v13, :cond_b

    .line 203
    iget-wide v14, v13, Lc/f/a/g;->a:J

    const-wide/16 v19, 0x1

    add-long v14, v14, v19

    iput-wide v14, v13, Lc/f/a/g;->a:J

    :cond_b
    if-ne v11, v6, :cond_c

    const/4 v11, 0x1

    goto :goto_7

    :cond_c
    const/4 v11, 0x0

    .line 204
    :goto_7
    invoke-virtual {v10, v11}, Lc/f/a/l/i;->b(Z)V

    if-ne v12, v6, :cond_d

    const/4 v15, 0x1

    goto :goto_8

    :cond_d
    const/4 v15, 0x0

    .line 205
    :goto_8
    invoke-virtual {v10, v15}, Lc/f/a/l/i;->a(Z)V

    .line 206
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    .line 207
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v12

    goto :goto_9

    :cond_e
    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 208
    :goto_9
    invoke-virtual {v10, v11}, Lc/f/a/l/i;->p(I)V

    .line 209
    invoke-virtual {v10, v12}, Lc/f/a/l/i;->h(I)V

    if-eqz v16, :cond_f

    .line 210
    invoke-virtual {v10, v11}, Lc/f/a/l/i;->r(I)V

    :cond_f
    if-eqz v17, :cond_10

    .line 211
    invoke-virtual {v10, v12}, Lc/f/a/l/i;->q(I)V

    .line 212
    :cond_10
    iget-boolean v6, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-eqz v6, :cond_11

    .line 213
    invoke-virtual {v8}, Landroid/view/View;->getBaseline()I

    move-result v6

    const/4 v8, -0x1

    if-eq v6, v8, :cond_11

    .line 214
    invoke-virtual {v10, v6}, Lc/f/a/l/i;->g(I)V

    :cond_11
    :goto_a
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    :cond_12
    return-void
.end method

.method public a(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_2

    .line 1
    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_2

    instance-of p1, p3, Ljava/lang/Integer;

    if-eqz p1, :cond_2

    .line 2
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    if-nez p1, :cond_0

    .line 3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    .line 4
    :cond_0
    check-cast p2, Ljava/lang/String;

    const-string p1, "/"

    .line 5
    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 6
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    .line 7
    :cond_1
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 8
    iget-object p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final a(Landroid/util/AttributeSet;)V
    .locals 7

    .line 13
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v0, p0}, Lc/f/a/l/i;->a(Ljava/lang/Object;)V

    .line 14
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc/f/b/f;

    if-eqz p1, :cond_7

    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lc/f/b/h;->ConstraintLayout_Layout:[I

    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_6

    .line 18
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v4

    .line 19
    sget v5, Lc/f/b/h;->ConstraintLayout_Layout_android_minWidth:I

    if-ne v4, v5, :cond_0

    .line 20
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    goto :goto_2

    .line 21
    :cond_0
    sget v5, Lc/f/b/h;->ConstraintLayout_Layout_android_minHeight:I

    if-ne v4, v5, :cond_1

    .line 22
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    goto :goto_2

    .line 23
    :cond_1
    sget v5, Lc/f/b/h;->ConstraintLayout_Layout_android_maxWidth:I

    if-ne v4, v5, :cond_2

    .line 24
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    goto :goto_2

    .line 25
    :cond_2
    sget v5, Lc/f/b/h;->ConstraintLayout_Layout_android_maxHeight:I

    if-ne v4, v5, :cond_3

    .line 26
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    goto :goto_2

    .line 27
    :cond_3
    sget v5, Lc/f/b/h;->ConstraintLayout_Layout_layout_optimizationLevel:I

    if-ne v4, v5, :cond_4

    .line 28
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    goto :goto_2

    .line 29
    :cond_4
    sget v5, Lc/f/b/h;->ConstraintLayout_Layout_constraintSet:I

    if-ne v4, v5, :cond_5

    .line 30
    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    .line 31
    :try_start_0
    new-instance v5, Lc/f/b/f;

    invoke-direct {v5}, Lc/f/b/f;-><init>()V

    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc/f/b/f;

    .line 32
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Lc/f/b/f;->a(Landroid/content/Context;I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 33
    :catch_0
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc/f/b/f;

    .line 34
    :goto_1
    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 35
    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 36
    :cond_7
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    invoke-virtual {p1, v0}, Lc/f/a/l/j;->v(I)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 215
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {p1}, Lc/f/a/l/j;->L()V

    .line 216
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:Lc/f/a/g;

    if-eqz p1, :cond_0

    .line 217
    iget-wide v0, p1, Lc/f/a/g;->c:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p1, Lc/f/a/g;->c:J

    :cond_0
    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 2
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0xe

    if-ge p2, p3, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public b(I)Landroid/view/View;
    .locals 1

    .line 91
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method public final b()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 3
    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 4
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 5
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->a()V

    :cond_2
    return-void
.end method

.method public final b(II)V
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 6
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v4

    add-int/2addr v3, v4

    .line 7
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v5

    add-int/2addr v4, v5

    .line 8
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    const/4 v7, 0x0

    :goto_0
    const-wide/16 v8, 0x1

    const/16 v10, 0x8

    const/4 v12, -0x2

    if-ge v7, v5, :cond_e

    .line 9
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    .line 10
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    move-result v15

    if-ne v15, v10, :cond_0

    goto/16 :goto_6

    .line 11
    :cond_0
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 12
    iget-object v15, v10, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lc/f/a/l/i;

    .line 13
    iget-boolean v6, v10, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-nez v6, :cond_c

    iget-boolean v6, v10, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-eqz v6, :cond_1

    goto/16 :goto_6

    .line 14
    :cond_1
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    move-result v6

    invoke-virtual {v15, v6}, Lc/f/a/l/i;->o(I)V

    .line 15
    iget v6, v10, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 16
    iget v13, v10, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-eqz v6, :cond_b

    if-nez v13, :cond_2

    goto/16 :goto_5

    :cond_2
    if-ne v6, v12, :cond_3

    const/16 v16, 0x1

    goto :goto_1

    :cond_3
    const/16 v16, 0x0

    .line 17
    :goto_1
    invoke-static {v1, v4, v6}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v11

    if-ne v13, v12, :cond_4

    const/16 v17, 0x1

    goto :goto_2

    :cond_4
    const/16 v17, 0x0

    .line 18
    :goto_2
    invoke-static {v2, v3, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v12

    .line 19
    invoke-virtual {v14, v11, v12}, Landroid/view/View;->measure(II)V

    .line 20
    iget-object v11, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:Lc/f/a/g;

    move v12, v3

    if-eqz v11, :cond_5

    .line 21
    iget-wide v2, v11, Lc/f/a/g;->a:J

    add-long/2addr v2, v8

    iput-wide v2, v11, Lc/f/a/g;->a:J

    :cond_5
    const/4 v2, -0x2

    if-ne v6, v2, :cond_6

    const/4 v3, 0x1

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    .line 22
    :goto_3
    invoke-virtual {v15, v3}, Lc/f/a/l/i;->b(Z)V

    if-ne v13, v2, :cond_7

    const/4 v13, 0x1

    goto :goto_4

    :cond_7
    const/4 v13, 0x0

    .line 23
    :goto_4
    invoke-virtual {v15, v13}, Lc/f/a/l/i;->a(Z)V

    .line 24
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 25
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 26
    invoke-virtual {v15, v2}, Lc/f/a/l/i;->p(I)V

    .line 27
    invoke-virtual {v15, v3}, Lc/f/a/l/i;->h(I)V

    if-eqz v16, :cond_8

    .line 28
    invoke-virtual {v15, v2}, Lc/f/a/l/i;->r(I)V

    :cond_8
    if-eqz v17, :cond_9

    .line 29
    invoke-virtual {v15, v3}, Lc/f/a/l/i;->q(I)V

    .line 30
    :cond_9
    iget-boolean v6, v10, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-eqz v6, :cond_a

    .line 31
    invoke-virtual {v14}, Landroid/view/View;->getBaseline()I

    move-result v6

    const/4 v8, -0x1

    if-eq v6, v8, :cond_a

    .line 32
    invoke-virtual {v15, v6}, Lc/f/a/l/i;->g(I)V

    .line 33
    :cond_a
    iget-boolean v6, v10, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    if-eqz v6, :cond_d

    iget-boolean v6, v10, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-eqz v6, :cond_d

    .line 34
    invoke-virtual {v15}, Lc/f/a/l/i;->n()Lc/f/a/l/r;

    move-result-object v6

    invoke-virtual {v6, v2}, Lc/f/a/l/r;->a(I)V

    .line 35
    invoke-virtual {v15}, Lc/f/a/l/i;->m()Lc/f/a/l/r;

    move-result-object v2

    invoke-virtual {v2, v3}, Lc/f/a/l/r;->a(I)V

    goto :goto_7

    :cond_b
    :goto_5
    move v12, v3

    .line 36
    invoke-virtual {v15}, Lc/f/a/l/i;->n()Lc/f/a/l/r;

    move-result-object v2

    invoke-virtual {v2}, Lc/f/a/l/s;->b()V

    .line 37
    invoke-virtual {v15}, Lc/f/a/l/i;->m()Lc/f/a/l/r;

    move-result-object v2

    invoke-virtual {v2}, Lc/f/a/l/s;->b()V

    goto :goto_7

    :cond_c
    :goto_6
    move v12, v3

    :cond_d
    :goto_7
    add-int/lit8 v7, v7, 0x1

    move/from16 v2, p2

    move v3, v12

    goto/16 :goto_0

    :cond_e
    move v12, v3

    .line 38
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v2}, Lc/f/a/l/j;->W()V

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v5, :cond_2b

    .line 39
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 40
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-ne v6, v10, :cond_f

    goto/16 :goto_18

    .line 41
    :cond_f
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 42
    iget-object v7, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lc/f/a/l/i;

    .line 43
    iget-boolean v11, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-nez v11, :cond_29

    iget-boolean v11, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-eqz v11, :cond_10

    goto/16 :goto_18

    .line 44
    :cond_10
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v11

    invoke-virtual {v7, v11}, Lc/f/a/l/i;->o(I)V

    .line 45
    iget v11, v6, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 46
    iget v13, v6, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-eqz v11, :cond_11

    if-eqz v13, :cond_11

    goto/16 :goto_18

    .line 47
    :cond_11
    sget-object v14, Lc/f/a/l/g$b;->c:Lc/f/a/l/g$b;

    invoke-virtual {v7, v14}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v14

    invoke-virtual {v14}, Lc/f/a/l/g;->d()Lc/f/a/l/q;

    move-result-object v14

    .line 48
    sget-object v15, Lc/f/a/l/g$b;->e:Lc/f/a/l/g$b;

    invoke-virtual {v7, v15}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v15

    invoke-virtual {v15}, Lc/f/a/l/g;->d()Lc/f/a/l/q;

    move-result-object v15

    .line 49
    sget-object v10, Lc/f/a/l/g$b;->c:Lc/f/a/l/g$b;

    invoke-virtual {v7, v10}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v10

    invoke-virtual {v10}, Lc/f/a/l/g;->g()Lc/f/a/l/g;

    move-result-object v10

    if-eqz v10, :cond_12

    sget-object v10, Lc/f/a/l/g$b;->e:Lc/f/a/l/g$b;

    .line 50
    invoke-virtual {v7, v10}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v10

    invoke-virtual {v10}, Lc/f/a/l/g;->g()Lc/f/a/l/g;

    move-result-object v10

    if-eqz v10, :cond_12

    const/4 v10, 0x1

    goto :goto_9

    :cond_12
    const/4 v10, 0x0

    .line 51
    :goto_9
    sget-object v8, Lc/f/a/l/g$b;->d:Lc/f/a/l/g$b;

    invoke-virtual {v7, v8}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v8

    invoke-virtual {v8}, Lc/f/a/l/g;->d()Lc/f/a/l/q;

    move-result-object v8

    .line 52
    sget-object v9, Lc/f/a/l/g$b;->f:Lc/f/a/l/g$b;

    invoke-virtual {v7, v9}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v9

    invoke-virtual {v9}, Lc/f/a/l/g;->d()Lc/f/a/l/q;

    move-result-object v9

    move/from16 v17, v5

    .line 53
    sget-object v5, Lc/f/a/l/g$b;->d:Lc/f/a/l/g$b;

    invoke-virtual {v7, v5}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v5

    invoke-virtual {v5}, Lc/f/a/l/g;->g()Lc/f/a/l/g;

    move-result-object v5

    if-eqz v5, :cond_13

    sget-object v5, Lc/f/a/l/g$b;->f:Lc/f/a/l/g$b;

    .line 54
    invoke-virtual {v7, v5}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v5

    invoke-virtual {v5}, Lc/f/a/l/g;->g()Lc/f/a/l/g;

    move-result-object v5

    if-eqz v5, :cond_13

    const/4 v5, 0x1

    goto :goto_a

    :cond_13
    const/4 v5, 0x0

    :goto_a
    if-nez v11, :cond_14

    if-nez v13, :cond_14

    if-eqz v10, :cond_14

    if-eqz v5, :cond_14

    move/from16 v5, p2

    move-object v6, v0

    move/from16 v20, v2

    const/4 v2, -0x1

    const/4 v8, -0x2

    const-wide/16 v18, 0x1

    goto/16 :goto_19

    :cond_14
    move/from16 v20, v2

    .line 55
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v2}, Lc/f/a/l/i;->k()Lc/f/a/l/i$a;

    move-result-object v2

    move-object/from16 v21, v6

    sget-object v6, Lc/f/a/l/i$a;->c:Lc/f/a/l/i$a;

    if-eq v2, v6, :cond_15

    const/4 v2, 0x1

    goto :goto_b

    :cond_15
    const/4 v2, 0x0

    .line 56
    :goto_b
    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v6}, Lc/f/a/l/i;->r()Lc/f/a/l/i$a;

    move-result-object v6

    sget-object v0, Lc/f/a/l/i$a;->c:Lc/f/a/l/i$a;

    if-eq v6, v0, :cond_16

    const/4 v0, 0x1

    goto :goto_c

    :cond_16
    const/4 v0, 0x0

    :goto_c
    if-nez v2, :cond_17

    .line 57
    invoke-virtual {v7}, Lc/f/a/l/i;->n()Lc/f/a/l/r;

    move-result-object v6

    invoke-virtual {v6}, Lc/f/a/l/s;->b()V

    :cond_17
    if-nez v0, :cond_18

    .line 58
    invoke-virtual {v7}, Lc/f/a/l/i;->m()Lc/f/a/l/r;

    move-result-object v6

    invoke-virtual {v6}, Lc/f/a/l/s;->b()V

    :cond_18
    if-nez v11, :cond_1a

    if-eqz v2, :cond_19

    .line 59
    invoke-virtual {v7}, Lc/f/a/l/i;->D()Z

    move-result v6

    if-eqz v6, :cond_19

    if-eqz v10, :cond_19

    invoke-virtual {v14}, Lc/f/a/l/s;->c()Z

    move-result v6

    if-eqz v6, :cond_19

    invoke-virtual {v15}, Lc/f/a/l/s;->c()Z

    move-result v6

    if-eqz v6, :cond_19

    .line 60
    invoke-virtual {v15}, Lc/f/a/l/q;->f()F

    move-result v6

    invoke-virtual {v14}, Lc/f/a/l/q;->f()F

    move-result v10

    sub-float/2addr v6, v10

    float-to-int v11, v6

    .line 61
    invoke-virtual {v7}, Lc/f/a/l/i;->n()Lc/f/a/l/r;

    move-result-object v6

    invoke-virtual {v6, v11}, Lc/f/a/l/r;->a(I)V

    .line 62
    invoke-static {v1, v4, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    goto :goto_d

    :cond_19
    const/4 v6, -0x2

    .line 63
    invoke-static {v1, v4, v6}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v2

    move v6, v2

    const/4 v2, 0x0

    const/4 v10, 0x1

    goto :goto_f

    :cond_1a
    const/4 v6, -0x2

    const/4 v10, -0x1

    if-ne v11, v10, :cond_1b

    .line 64
    invoke-static {v1, v4, v10}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v14

    move v6, v14

    :goto_d
    const/4 v10, 0x0

    goto :goto_f

    :cond_1b
    if-ne v11, v6, :cond_1c

    const/4 v6, 0x1

    goto :goto_e

    :cond_1c
    const/4 v6, 0x0

    .line 65
    :goto_e
    invoke-static {v1, v4, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v10

    move/from16 v22, v10

    move v10, v6

    move/from16 v6, v22

    :goto_f
    if-nez v13, :cond_1e

    if-eqz v0, :cond_1d

    .line 66
    invoke-virtual {v7}, Lc/f/a/l/i;->C()Z

    move-result v14

    if-eqz v14, :cond_1d

    if-eqz v5, :cond_1d

    invoke-virtual {v8}, Lc/f/a/l/s;->c()Z

    move-result v5

    if-eqz v5, :cond_1d

    invoke-virtual {v9}, Lc/f/a/l/s;->c()Z

    move-result v5

    if-eqz v5, :cond_1d

    .line 67
    invoke-virtual {v9}, Lc/f/a/l/q;->f()F

    move-result v5

    invoke-virtual {v8}, Lc/f/a/l/q;->f()F

    move-result v8

    sub-float/2addr v5, v8

    float-to-int v13, v5

    .line 68
    invoke-virtual {v7}, Lc/f/a/l/i;->m()Lc/f/a/l/r;

    move-result-object v5

    invoke-virtual {v5, v13}, Lc/f/a/l/r;->a(I)V

    move/from16 v5, p2

    .line 69
    invoke-static {v5, v12, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v8

    goto :goto_10

    :cond_1d
    move/from16 v5, p2

    const/4 v8, -0x2

    .line 70
    invoke-static {v5, v12, v8}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v0

    move v8, v0

    const/4 v0, 0x0

    const/4 v9, 0x1

    goto :goto_12

    :cond_1e
    move/from16 v5, p2

    const/4 v8, -0x2

    const/4 v9, -0x1

    if-ne v13, v9, :cond_1f

    .line 71
    invoke-static {v5, v12, v9}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v14

    move v8, v14

    :goto_10
    const/4 v9, 0x0

    goto :goto_12

    :cond_1f
    if-ne v13, v8, :cond_20

    const/4 v8, 0x1

    goto :goto_11

    :cond_20
    const/4 v8, 0x0

    .line 72
    :goto_11
    invoke-static {v5, v12, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v9

    move/from16 v22, v9

    move v9, v8

    move/from16 v8, v22

    .line 73
    :goto_12
    invoke-virtual {v3, v6, v8}, Landroid/view/View;->measure(II)V

    move-object/from16 v6, p0

    .line 74
    iget-object v8, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->q:Lc/f/a/g;

    if-eqz v8, :cond_21

    .line 75
    iget-wide v14, v8, Lc/f/a/g;->a:J

    const-wide/16 v18, 0x1

    add-long v14, v14, v18

    iput-wide v14, v8, Lc/f/a/g;->a:J

    goto :goto_13

    :cond_21
    const-wide/16 v18, 0x1

    :goto_13
    const/4 v8, -0x2

    if-ne v11, v8, :cond_22

    const/4 v11, 0x1

    goto :goto_14

    :cond_22
    const/4 v11, 0x0

    .line 76
    :goto_14
    invoke-virtual {v7, v11}, Lc/f/a/l/i;->b(Z)V

    if-ne v13, v8, :cond_23

    const/4 v11, 0x1

    goto :goto_15

    :cond_23
    const/4 v11, 0x0

    .line 77
    :goto_15
    invoke-virtual {v7, v11}, Lc/f/a/l/i;->a(Z)V

    .line 78
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    .line 79
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    .line 80
    invoke-virtual {v7, v11}, Lc/f/a/l/i;->p(I)V

    .line 81
    invoke-virtual {v7, v13}, Lc/f/a/l/i;->h(I)V

    if-eqz v10, :cond_24

    .line 82
    invoke-virtual {v7, v11}, Lc/f/a/l/i;->r(I)V

    :cond_24
    if-eqz v9, :cond_25

    .line 83
    invoke-virtual {v7, v13}, Lc/f/a/l/i;->q(I)V

    :cond_25
    if-eqz v2, :cond_26

    .line 84
    invoke-virtual {v7}, Lc/f/a/l/i;->n()Lc/f/a/l/r;

    move-result-object v2

    invoke-virtual {v2, v11}, Lc/f/a/l/r;->a(I)V

    goto :goto_16

    .line 85
    :cond_26
    invoke-virtual {v7}, Lc/f/a/l/i;->n()Lc/f/a/l/r;

    move-result-object v2

    invoke-virtual {v2}, Lc/f/a/l/r;->f()V

    :goto_16
    if-eqz v0, :cond_27

    .line 86
    invoke-virtual {v7}, Lc/f/a/l/i;->m()Lc/f/a/l/r;

    move-result-object v0

    invoke-virtual {v0, v13}, Lc/f/a/l/r;->a(I)V

    goto :goto_17

    .line 87
    :cond_27
    invoke-virtual {v7}, Lc/f/a/l/i;->m()Lc/f/a/l/r;

    move-result-object v0

    invoke-virtual {v0}, Lc/f/a/l/r;->f()V

    :goto_17
    move-object/from16 v0, v21

    .line 88
    iget-boolean v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-eqz v0, :cond_28

    .line 89
    invoke-virtual {v3}, Landroid/view/View;->getBaseline()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2a

    .line 90
    invoke-virtual {v7, v0}, Lc/f/a/l/i;->g(I)V

    goto :goto_19

    :cond_28
    const/4 v2, -0x1

    goto :goto_19

    :cond_29
    :goto_18
    move-object v6, v0

    move/from16 v20, v2

    move/from16 v17, v5

    move-wide/from16 v18, v8

    const/4 v2, -0x1

    const/4 v8, -0x2

    move/from16 v5, p2

    :cond_2a
    :goto_19
    add-int/lit8 v0, v20, 0x1

    move v2, v0

    move-object v0, v6

    move/from16 v5, v17

    move-wide/from16 v8, v18

    const/16 v10, 0x8

    goto/16 :goto_8

    :cond_2b
    move-object v6, v0

    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 2
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    :goto_1
    if-ge v1, v0, :cond_1

    .line 4
    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/f/b/b;

    .line 5
    invoke-virtual {v2, p0}, Lc/f/b/b;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final c(II)V
    .locals 9

    .line 6
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 7
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    add-int/2addr v2, v3

    .line 11
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v4

    add-int/2addr v3, v4

    .line 12
    sget-object v4, Lc/f/a/l/i$a;->b:Lc/f/a/l/i$a;

    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    const/high16 v5, 0x40000000    # 2.0f

    const/high16 v6, -0x80000000

    const/4 v7, 0x0

    if-eq v0, v6, :cond_2

    if-eqz v0, :cond_1

    if-eq v0, v5, :cond_0

    move-object p1, v4

    :goto_0
    const/4 v0, 0x0

    goto :goto_1

    .line 14
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    sub-int/2addr p1, v3

    move v0, p1

    move-object p1, v4

    goto :goto_1

    .line 15
    :cond_1
    sget-object p1, Lc/f/a/l/i$a;->c:Lc/f/a/l/i$a;

    goto :goto_0

    .line 16
    :cond_2
    sget-object v0, Lc/f/a/l/i$a;->c:Lc/f/a/l/i$a;

    move-object v8, v0

    move v0, p1

    move-object p1, v8

    :goto_1
    if-eq v1, v6, :cond_5

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    :goto_2
    const/4 p2, 0x0

    goto :goto_3

    .line 17
    :cond_3
    iget v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int/2addr p2, v2

    goto :goto_3

    .line 18
    :cond_4
    sget-object v4, Lc/f/a/l/i$a;->c:Lc/f/a/l/i$a;

    goto :goto_2

    .line 19
    :cond_5
    sget-object v4, Lc/f/a/l/i$a;->c:Lc/f/a/l/i$a;

    .line 20
    :goto_3
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v1, v7}, Lc/f/a/l/i;->m(I)V

    .line 21
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v1, v7}, Lc/f/a/l/i;->l(I)V

    .line 22
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v1, p1}, Lc/f/a/l/i;->a(Lc/f/a/l/i$a;)V

    .line 23
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {p1, v0}, Lc/f/a/l/i;->p(I)V

    .line 24
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {p1, v4}, Lc/f/a/l/i;->b(Lc/f/a/l/i$a;)V

    .line 25
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {p1, p2}, Lc/f/a/l/i;->h(I)V

    .line 26
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    iget p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p1, p2}, Lc/f/a/l/i;->m(I)V

    .line 27
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    iget p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p1, p2}, Lc/f/a/l/i;->l(I)V

    return-void
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    return p1
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 20

    .line 1
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 4
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    int-to-float v1, v1

    .line 5
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x44870000    # 1080.0f

    const/high16 v4, 0x44f00000    # 1920.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v0, :cond_2

    move-object/from16 v7, p0

    .line 6
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 7
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    const/16 v10, 0x8

    if-ne v9, v10, :cond_0

    goto/16 :goto_1

    .line 8
    :cond_0
    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 9
    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_1

    .line 10
    check-cast v8, Ljava/lang/String;

    const-string v9, ","

    .line 11
    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 12
    array-length v9, v8

    const/4 v10, 0x4

    if-ne v9, v10, :cond_1

    .line 13
    aget-object v9, v8, v5

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x1

    .line 14
    aget-object v10, v8, v10

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    const/4 v11, 0x2

    .line 15
    aget-object v11, v8, v11

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    const/4 v12, 0x3

    .line 16
    aget-object v8, v8, v12

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    int-to-float v9, v9

    div-float/2addr v9, v3

    mul-float v9, v9, v1

    float-to-int v9, v9

    int-to-float v10, v10

    div-float/2addr v10, v4

    mul-float v10, v10, v2

    float-to-int v10, v10

    int-to-float v11, v11

    div-float/2addr v11, v3

    mul-float v11, v11, v1

    float-to-int v11, v11

    int-to-float v8, v8

    div-float/2addr v8, v4

    mul-float v8, v8, v2

    float-to-int v8, v8

    .line 17
    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v12, -0x10000

    .line 18
    invoke-virtual {v15, v12}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v14, v9

    int-to-float v13, v10

    add-int/2addr v9, v11

    int-to-float v9, v9

    move-object/from16 v12, p1

    move v11, v13

    move v13, v14

    move/from16 v18, v14

    move v14, v11

    move-object/from16 v19, v15

    move v15, v9

    move/from16 v16, v11

    move-object/from16 v17, v19

    .line 19
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v10, v8

    int-to-float v8, v10

    move v13, v9

    move/from16 v16, v8

    .line 20
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v14, v8

    move/from16 v15, v18

    .line 21
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v13, v18

    move/from16 v16, v11

    .line 22
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const v10, -0xff0100

    move-object/from16 v15, v19

    .line 23
    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    move v14, v11

    move-object v10, v15

    move v15, v9

    move/from16 v16, v8

    move-object/from16 v17, v10

    .line 24
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v14, v8

    move/from16 v16, v11

    .line 25
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_1
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_2
    move-object/from16 v7, p0

    return-void
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->generateDefaultLayoutParams()Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move-result-object v0

    return-object v0
.end method

.method public generateDefaultLayoutParams()Landroidx/constraintlayout/widget/ConstraintLayout$a;
    .locals 2

    .line 2
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->generateLayoutParams(Landroid/util/AttributeSet;)Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move-result-object p1

    return-object p1
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 3
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-direct {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroidx/constraintlayout/widget/ConstraintLayout$a;
    .locals 2

    .line 2
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    return v0
.end method

.method public getMinHeight()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v0}, Lc/f/a/l/j;->N()I

    move-result v0

    return v0
.end method

.method public onLayout(ZIIII)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p1, :cond_2

    .line 3
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    .line 4
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 5
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lc/f/a/l/i;

    .line 6
    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-nez v2, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    .line 7
    :cond_0
    iget-boolean v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    if-eqz v0, :cond_1

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {v1}, Lc/f/a/l/i;->h()I

    move-result v0

    .line 9
    invoke-virtual {v1}, Lc/f/a/l/i;->i()I

    move-result v2

    .line 10
    invoke-virtual {v1}, Lc/f/a/l/i;->t()I

    move-result v3

    add-int/2addr v3, v0

    .line 11
    invoke-virtual {v1}, Lc/f/a/l/i;->j()I

    move-result v1

    add-int/2addr v1, v2

    .line 12
    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :goto_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    .line 13
    :cond_2
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_3

    :goto_2
    if-ge p3, p1, :cond_3

    .line 14
    iget-object p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/f/b/b;

    .line 15
    invoke-virtual {p2, p0}, Lc/f/b/b;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public onMeasure(II)V
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 3
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    .line 4
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    .line 5
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    .line 6
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v7

    .line 7
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v8

    .line 8
    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v9, v7}, Lc/f/a/l/i;->s(I)V

    .line 9
    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v9, v8}, Lc/f/a/l/i;->t(I)V

    .line 10
    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    iget v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-virtual {v9, v10}, Lc/f/a/l/i;->k(I)V

    .line 11
    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    iget v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-virtual {v9, v10}, Lc/f/a/l/i;->j(I)V

    .line 12
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/16 v12, 0x11

    if-lt v9, v12, :cond_1

    .line 13
    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getLayoutDirection()I

    move-result v12

    if-ne v12, v11, :cond_0

    const/4 v12, 0x1

    goto :goto_0

    :cond_0
    const/4 v12, 0x0

    :goto_0
    invoke-virtual {v9, v12}, Lc/f/a/l/j;->c(Z)V

    .line 14
    :cond_1
    invoke-virtual/range {p0 .. p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(II)V

    .line 15
    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v9}, Lc/f/a/l/i;->t()I

    move-result v9

    .line 16
    iget-object v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v12}, Lc/f/a/l/i;->j()I

    move-result v12

    .line 17
    iget-boolean v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    if-eqz v13, :cond_2

    .line 18
    iput-boolean v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    .line 19
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->b()V

    const/4 v13, 0x1

    goto :goto_1

    :cond_2
    const/4 v13, 0x0

    .line 20
    :goto_1
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    const/16 v15, 0x8

    and-int/2addr v14, v15

    if-ne v14, v15, :cond_3

    const/4 v14, 0x1

    goto :goto_2

    :cond_3
    const/4 v14, 0x0

    :goto_2
    if-eqz v14, :cond_4

    .line 21
    iget-object v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v15}, Lc/f/a/l/j;->U()V

    .line 22
    iget-object v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v15, v9, v12}, Lc/f/a/l/j;->f(II)V

    .line 23
    invoke-virtual/range {p0 .. p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(II)V

    goto :goto_3

    .line 24
    :cond_4
    invoke-virtual/range {p0 .. p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(II)V

    .line 25
    :goto_3
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->c()V

    .line 26
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v15

    if-lez v15, :cond_5

    if-eqz v13, :cond_5

    .line 27
    iget-object v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-static {v13}, Lc/f/a/l/a;->a(Lc/f/a/l/j;)V

    .line 28
    :cond_5
    iget-object v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    iget-boolean v15, v13, Lc/f/a/l/j;->x0:Z

    if-eqz v15, :cond_9

    .line 29
    iget-boolean v15, v13, Lc/f/a/l/j;->y0:Z

    const/high16 v11, -0x80000000

    if-eqz v15, :cond_7

    if-ne v3, v11, :cond_7

    .line 30
    iget v15, v13, Lc/f/a/l/j;->A0:I

    if-ge v15, v4, :cond_6

    .line 31
    invoke-virtual {v13, v15}, Lc/f/a/l/i;->p(I)V

    .line 32
    :cond_6
    iget-object v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    sget-object v15, Lc/f/a/l/i$a;->b:Lc/f/a/l/i$a;

    .line 33
    invoke-virtual {v13, v15}, Lc/f/a/l/i;->a(Lc/f/a/l/i$a;)V

    .line 34
    :cond_7
    iget-object v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    iget-boolean v15, v13, Lc/f/a/l/j;->z0:Z

    if-eqz v15, :cond_9

    if-ne v5, v11, :cond_9

    .line 35
    iget v11, v13, Lc/f/a/l/j;->B0:I

    if-ge v11, v6, :cond_8

    .line 36
    invoke-virtual {v13, v11}, Lc/f/a/l/i;->h(I)V

    .line 37
    :cond_8
    iget-object v11, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    sget-object v13, Lc/f/a/l/i$a;->b:Lc/f/a/l/i$a;

    .line 38
    invoke-virtual {v11, v13}, Lc/f/a/l/i;->b(Lc/f/a/l/i$a;)V

    .line 39
    :cond_9
    iget v11, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    const/16 v13, 0x20

    and-int/2addr v11, v13

    const/high16 v15, 0x40000000    # 2.0f

    if-ne v11, v13, :cond_d

    .line 40
    iget-object v11, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v11}, Lc/f/a/l/i;->t()I

    move-result v11

    .line 41
    iget-object v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v13}, Lc/f/a/l/i;->j()I

    move-result v13

    .line 42
    iget v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    if-eq v10, v11, :cond_a

    if-ne v3, v15, :cond_a

    .line 43
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    iget-object v3, v3, Lc/f/a/l/j;->w0:Ljava/util/List;

    const/4 v10, 0x0

    invoke-static {v3, v10, v11}, Lc/f/a/l/a;->a(Ljava/util/List;II)V

    .line 44
    :cond_a
    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    if-eq v3, v13, :cond_b

    if-ne v5, v15, :cond_b

    .line 45
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    iget-object v3, v3, Lc/f/a/l/j;->w0:Ljava/util/List;

    const/4 v5, 0x1

    invoke-static {v3, v5, v13}, Lc/f/a/l/a;->a(Ljava/util/List;II)V

    .line 46
    :cond_b
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    iget-boolean v5, v3, Lc/f/a/l/j;->y0:Z

    if-eqz v5, :cond_c

    iget v5, v3, Lc/f/a/l/j;->A0:I

    if-le v5, v4, :cond_c

    .line 47
    iget-object v3, v3, Lc/f/a/l/j;->w0:Ljava/util/List;

    const/4 v10, 0x0

    invoke-static {v3, v10, v4}, Lc/f/a/l/a;->a(Ljava/util/List;II)V

    goto :goto_4

    :cond_c
    const/4 v10, 0x0

    .line 48
    :goto_4
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    iget-boolean v4, v3, Lc/f/a/l/j;->z0:Z

    if-eqz v4, :cond_d

    iget v4, v3, Lc/f/a/l/j;->B0:I

    if-le v4, v6, :cond_d

    .line 49
    iget-object v3, v3, Lc/f/a/l/j;->w0:Ljava/util/List;

    const/4 v4, 0x1

    invoke-static {v3, v4, v6}, Lc/f/a/l/a;->a(Ljava/util/List;II)V

    goto :goto_5

    :cond_d
    const/4 v4, 0x1

    .line 50
    :goto_5
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-lez v3, :cond_e

    const-string v3, "First pass"

    .line 51
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Ljava/lang/String;)V

    .line 52
    :cond_e
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 53
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v5

    add-int/2addr v8, v5

    .line 54
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v5

    add-int/2addr v7, v5

    if-lez v3, :cond_2c

    .line 55
    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v6}, Lc/f/a/l/i;->k()Lc/f/a/l/i$a;

    move-result-object v6

    sget-object v11, Lc/f/a/l/i$a;->c:Lc/f/a/l/i$a;

    if-ne v6, v11, :cond_f

    const/4 v6, 0x1

    goto :goto_6

    :cond_f
    const/4 v6, 0x0

    .line 56
    :goto_6
    iget-object v11, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v11}, Lc/f/a/l/i;->r()Lc/f/a/l/i$a;

    move-result-object v11

    sget-object v13, Lc/f/a/l/i$a;->c:Lc/f/a/l/i$a;

    if-ne v11, v13, :cond_10

    const/4 v11, 0x1

    goto :goto_7

    :cond_10
    const/4 v11, 0x0

    .line 57
    :goto_7
    iget-object v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v13}, Lc/f/a/l/i;->t()I

    move-result v13

    iget v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-static {v13, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 58
    iget-object v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v13}, Lc/f/a/l/i;->j()I

    move-result v13

    iget v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-static {v13, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    move v5, v10

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    :goto_8
    const-wide/16 v17, 0x1

    if-ge v10, v3, :cond_21

    .line 59
    iget-object v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lc/f/a/l/i;

    .line 60
    invoke-virtual {v15}, Lc/f/a/l/i;->f()Ljava/lang/Object;

    move-result-object v19

    move/from16 v20, v3

    move-object/from16 v3, v19

    check-cast v3, Landroid/view/View;

    if-nez v3, :cond_11

    move/from16 v19, v9

    move/from16 v21, v12

    goto/16 :goto_e

    .line 61
    :cond_11
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v19

    move/from16 v21, v12

    move-object/from16 v12, v19

    check-cast v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move/from16 v19, v9

    .line 62
    iget-boolean v9, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-nez v9, :cond_20

    iget-boolean v9, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-eqz v9, :cond_12

    goto/16 :goto_e

    .line 63
    :cond_12
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v9

    move/from16 v22, v13

    const/16 v13, 0x8

    if-ne v9, v13, :cond_13

    :goto_9
    goto/16 :goto_f

    :cond_13
    if-eqz v14, :cond_14

    .line 64
    invoke-virtual {v15}, Lc/f/a/l/i;->n()Lc/f/a/l/r;

    move-result-object v9

    invoke-virtual {v9}, Lc/f/a/l/s;->c()Z

    move-result v9

    if-eqz v9, :cond_14

    .line 65
    invoke-virtual {v15}, Lc/f/a/l/i;->m()Lc/f/a/l/r;

    move-result-object v9

    invoke-virtual {v9}, Lc/f/a/l/s;->c()Z

    move-result v9

    if-eqz v9, :cond_14

    goto :goto_9

    .line 66
    :cond_14
    iget v9, v12, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v13, -0x2

    if-ne v9, v13, :cond_15

    iget-boolean v13, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    if-eqz v13, :cond_15

    .line 67
    invoke-static {v1, v7, v9}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v9

    goto :goto_a

    .line 68
    :cond_15
    invoke-virtual {v15}, Lc/f/a/l/i;->t()I

    move-result v9

    const/high16 v13, 0x40000000    # 2.0f

    invoke-static {v9, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    .line 69
    :goto_a
    iget v13, v12, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v1, -0x2

    if-ne v13, v1, :cond_16

    iget-boolean v1, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-eqz v1, :cond_16

    .line 70
    invoke-static {v2, v8, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v1

    goto :goto_b

    .line 71
    :cond_16
    invoke-virtual {v15}, Lc/f/a/l/i;->j()I

    move-result v1

    const/high16 v13, 0x40000000    # 2.0f

    invoke-static {v1, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 72
    :goto_b
    invoke-virtual {v3, v9, v1}, Landroid/view/View;->measure(II)V

    .line 73
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:Lc/f/a/g;

    move v13, v8

    if-eqz v1, :cond_17

    .line 74
    iget-wide v8, v1, Lc/f/a/g;->b:J

    add-long v8, v8, v17

    iput-wide v8, v1, Lc/f/a/g;->b:J

    .line 75
    :cond_17
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 76
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    .line 77
    invoke-virtual {v15}, Lc/f/a/l/i;->t()I

    move-result v9

    if-eq v1, v9, :cond_1a

    .line 78
    invoke-virtual {v15, v1}, Lc/f/a/l/i;->p(I)V

    if-eqz v14, :cond_18

    .line 79
    invoke-virtual {v15}, Lc/f/a/l/i;->n()Lc/f/a/l/r;

    move-result-object v9

    invoke-virtual {v9, v1}, Lc/f/a/l/r;->a(I)V

    :cond_18
    if-eqz v6, :cond_19

    .line 80
    invoke-virtual {v15}, Lc/f/a/l/i;->o()I

    move-result v1

    if-le v1, v4, :cond_19

    .line 81
    invoke-virtual {v15}, Lc/f/a/l/i;->o()I

    move-result v1

    sget-object v9, Lc/f/a/l/g$b;->e:Lc/f/a/l/g$b;

    .line 82
    invoke-virtual {v15, v9}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v9

    invoke-virtual {v9}, Lc/f/a/l/g;->b()I

    move-result v9

    add-int/2addr v1, v9

    .line 83
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    :cond_19
    const/16 v22, 0x1

    .line 84
    :cond_1a
    invoke-virtual {v15}, Lc/f/a/l/i;->j()I

    move-result v1

    if-eq v8, v1, :cond_1d

    .line 85
    invoke-virtual {v15, v8}, Lc/f/a/l/i;->h(I)V

    if-eqz v14, :cond_1b

    .line 86
    invoke-virtual {v15}, Lc/f/a/l/i;->m()Lc/f/a/l/r;

    move-result-object v1

    invoke-virtual {v1, v8}, Lc/f/a/l/r;->a(I)V

    :cond_1b
    if-eqz v11, :cond_1c

    .line 87
    invoke-virtual {v15}, Lc/f/a/l/i;->e()I

    move-result v1

    if-le v1, v5, :cond_1c

    .line 88
    invoke-virtual {v15}, Lc/f/a/l/i;->e()I

    move-result v1

    sget-object v8, Lc/f/a/l/g$b;->f:Lc/f/a/l/g$b;

    .line 89
    invoke-virtual {v15, v8}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;

    move-result-object v8

    invoke-virtual {v8}, Lc/f/a/l/g;->b()I

    move-result v8

    add-int/2addr v1, v8

    .line 90
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v5, v1

    :cond_1c
    move v1, v5

    const/4 v5, 0x1

    goto :goto_c

    :cond_1d
    move v1, v5

    move/from16 v5, v22

    .line 91
    :goto_c
    iget-boolean v8, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-eqz v8, :cond_1e

    .line 92
    invoke-virtual {v3}, Landroid/view/View;->getBaseline()I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_1e

    .line 93
    invoke-virtual {v15}, Lc/f/a/l/i;->d()I

    move-result v9

    if-eq v8, v9, :cond_1e

    .line 94
    invoke-virtual {v15, v8}, Lc/f/a/l/i;->g(I)V

    const/4 v5, 0x1

    .line 95
    :cond_1e
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0xb

    if-lt v8, v9, :cond_1f

    .line 96
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I

    move-result v3

    move/from16 v8, v16

    invoke-static {v8, v3}, Landroid/view/ViewGroup;->combineMeasuredStates(II)I

    move-result v3

    move/from16 v16, v3

    goto :goto_d

    :cond_1f
    move/from16 v8, v16

    :goto_d
    move/from16 v22, v5

    move v5, v1

    goto :goto_10

    :cond_20
    :goto_e
    move/from16 v22, v13

    :goto_f
    move v13, v8

    move/from16 v8, v16

    move/from16 v16, v8

    :goto_10
    add-int/lit8 v10, v10, 0x1

    move/from16 v1, p1

    move v8, v13

    move/from16 v9, v19

    move/from16 v3, v20

    move/from16 v12, v21

    move/from16 v13, v22

    const/high16 v15, 0x40000000    # 2.0f

    goto/16 :goto_8

    :cond_21
    move/from16 v20, v3

    move/from16 v19, v9

    move/from16 v21, v12

    move/from16 v22, v13

    move v13, v8

    move/from16 v8, v16

    if-eqz v22, :cond_25

    .line 97
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    move/from16 v3, v19

    invoke-virtual {v1, v3}, Lc/f/a/l/i;->p(I)V

    .line 98
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    move/from16 v3, v21

    invoke-virtual {v1, v3}, Lc/f/a/l/i;->h(I)V

    if-eqz v14, :cond_22

    .line 99
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v1}, Lc/f/a/l/j;->W()V

    :cond_22
    const-string v1, "2nd pass"

    .line 100
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Ljava/lang/String;)V

    .line 101
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v1}, Lc/f/a/l/i;->t()I

    move-result v1

    if-ge v1, v4, :cond_23

    .line 102
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v1, v4}, Lc/f/a/l/i;->p(I)V

    const/4 v10, 0x1

    goto :goto_11

    :cond_23
    const/4 v10, 0x0

    .line 103
    :goto_11
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v1}, Lc/f/a/l/i;->j()I

    move-result v1

    if-ge v1, v5, :cond_24

    .line 104
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v1, v5}, Lc/f/a/l/i;->h(I)V

    const/4 v11, 0x1

    goto :goto_12

    :cond_24
    move v11, v10

    :goto_12
    if-eqz v11, :cond_25

    const-string v1, "3rd pass"

    .line 105
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Ljava/lang/String;)V

    :cond_25
    move/from16 v1, v20

    const/4 v10, 0x0

    :goto_13
    if-ge v10, v1, :cond_2b

    .line 106
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/f/a/l/i;

    .line 107
    invoke-virtual {v3}, Lc/f/a/l/i;->f()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-nez v4, :cond_28

    :cond_26
    const/16 v6, 0x8

    :cond_27
    const/high16 v9, 0x40000000    # 2.0f

    goto :goto_14

    .line 108
    :cond_28
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    invoke-virtual {v3}, Lc/f/a/l/i;->t()I

    move-result v6

    if-ne v5, v6, :cond_29

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-virtual {v3}, Lc/f/a/l/i;->j()I

    move-result v6

    if-eq v5, v6, :cond_26

    .line 109
    :cond_29
    invoke-virtual {v3}, Lc/f/a/l/i;->s()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_27

    .line 110
    invoke-virtual {v3}, Lc/f/a/l/i;->t()I

    move-result v5

    const/high16 v9, 0x40000000    # 2.0f

    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 111
    invoke-virtual {v3}, Lc/f/a/l/i;->j()I

    move-result v3

    invoke-static {v3, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 112
    invoke-virtual {v4, v5, v3}, Landroid/view/View;->measure(II)V

    .line 113
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:Lc/f/a/g;

    if-eqz v3, :cond_2a

    .line 114
    iget-wide v4, v3, Lc/f/a/g;->b:J

    add-long v4, v4, v17

    iput-wide v4, v3, Lc/f/a/g;->b:J

    :cond_2a
    :goto_14
    add-int/lit8 v10, v10, 0x1

    goto :goto_13

    :cond_2b
    move v10, v8

    goto :goto_15

    :cond_2c
    move v13, v8

    const/4 v10, 0x0

    .line 115
    :goto_15
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v1}, Lc/f/a/l/i;->t()I

    move-result v1

    add-int/2addr v1, v7

    .line 116
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v3}, Lc/f/a/l/i;->j()I

    move-result v3

    add-int/2addr v3, v13

    .line 117
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0xb

    if-lt v4, v5, :cond_2f

    move/from16 v4, p1

    .line 118
    invoke-static {v1, v4, v10}, Landroid/view/ViewGroup;->resolveSizeAndState(III)I

    move-result v1

    shl-int/lit8 v4, v10, 0x10

    .line 119
    invoke-static {v3, v2, v4}, Landroid/view/ViewGroup;->resolveSizeAndState(III)I

    move-result v2

    const v3, 0xffffff

    and-int/2addr v1, v3

    and-int/2addr v2, v3

    .line 120
    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 121
    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 122
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v3}, Lc/f/a/l/j;->R()Z

    move-result v3

    const/high16 v4, 0x1000000

    if-eqz v3, :cond_2d

    or-int/2addr v1, v4

    .line 123
    :cond_2d
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v3}, Lc/f/a/l/j;->P()Z

    move-result v3

    if-eqz v3, :cond_2e

    or-int/2addr v2, v4

    .line 124
    :cond_2e
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    .line 125
    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    .line 126
    iput v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    goto :goto_16

    .line 127
    :cond_2f
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    .line 128
    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    .line 129
    iput v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    :goto_16
    return-void
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/view/View;)Lc/f/a/l/i;

    move-result-object v0

    .line 4
    instance-of v1, p1, Landroidx/constraintlayout/widget/Guideline;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 5
    instance-of v0, v0, Lc/f/a/l/m;

    if-nez v0, :cond_1

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 7
    new-instance v1, Lc/f/a/l/m;

    invoke-direct {v1}, Lc/f/a/l/m;-><init>()V

    iput-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lc/f/a/l/i;

    .line 8
    iput-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    .line 9
    check-cast v1, Lc/f/a/l/m;

    iget v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    invoke-virtual {v1, v0}, Lc/f/a/l/m;->w(I)V

    .line 10
    :cond_1
    instance-of v0, p1, Lc/f/b/b;

    if-eqz v0, :cond_2

    .line 11
    move-object v0, p1

    check-cast v0, Lc/f/b/b;

    .line 12
    invoke-virtual {v0}, Lc/f/b/b;->a()V

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 14
    iput-boolean v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    .line 15
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 16
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_2
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 18
    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    .line 4
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/view/View;)Lc/f/a/l/i;

    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v1, v0}, Lc/f/a/l/v;->c(Lc/f/a/l/i;)V

    .line 6
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public requestLayout()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    .line 4
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    return-void
.end method

.method public setConstraintSet(Lc/f/b/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc/f/b/f;

    return-void
.end method

.method public setId(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    .line 2
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setId(I)V

    .line 3
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v0

    invoke-virtual {p1, v0, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 3
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    .line 3
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    .line 3
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 3
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lc/f/a/l/j;

    invoke-virtual {v0, p1}, Lc/f/a/l/j;->v(I)V

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
