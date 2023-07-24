.class public Lc/l/d/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/view/View;

.field public b:Landroid/animation/Animator;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Boolean;

.field public r:Ljava/lang/Boolean;

.field public s:Lc/h/e/i0;

.field public t:Lc/h/e/i0;

.field public u:F

.field public v:Landroid/view/View;

.field public w:Z

.field public x:Lc/l/d/z;

.field public y:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc/l/d/x;->k:Ljava/lang/Object;

    .line 3
    sget-object v1, Landroidx/fragment/app/Fragment;->Y:Ljava/lang/Object;

    iput-object v1, p0, Lc/l/d/x;->l:Ljava/lang/Object;

    .line 4
    iput-object v0, p0, Lc/l/d/x;->m:Ljava/lang/Object;

    .line 5
    iput-object v1, p0, Lc/l/d/x;->n:Ljava/lang/Object;

    .line 6
    iput-object v0, p0, Lc/l/d/x;->o:Ljava/lang/Object;

    .line 7
    iput-object v1, p0, Lc/l/d/x;->p:Ljava/lang/Object;

    .line 8
    iput-object v0, p0, Lc/l/d/x;->s:Lc/h/e/i0;

    .line 9
    iput-object v0, p0, Lc/l/d/x;->t:Lc/h/e/i0;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 10
    iput v1, p0, Lc/l/d/x;->u:F

    .line 11
    iput-object v0, p0, Lc/l/d/x;->v:Landroid/view/View;

    return-void
.end method
