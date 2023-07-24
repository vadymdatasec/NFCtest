.class public final Lc/l/d/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Landroidx/fragment/app/Fragment;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Lc/n/g$b;

.field public h:Lc/n/g$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILandroidx/fragment/app/Fragment;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lc/l/d/d2;->a:I

    .line 4
    iput-object p2, p0, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    .line 5
    sget-object p1, Lc/n/g$b;->f:Lc/n/g$b;

    iput-object p1, p0, Lc/l/d/d2;->g:Lc/n/g$b;

    .line 6
    iput-object p1, p0, Lc/l/d/d2;->h:Lc/n/g$b;

    return-void
.end method

.method public constructor <init>(ILandroidx/fragment/app/Fragment;Lc/n/g$b;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Lc/l/d/d2;->a:I

    .line 9
    iput-object p2, p0, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    .line 10
    iget-object p1, p2, Landroidx/fragment/app/Fragment;->R:Lc/n/g$b;

    iput-object p1, p0, Lc/l/d/d2;->g:Lc/n/g$b;

    .line 11
    iput-object p3, p0, Lc/l/d/d2;->h:Lc/n/g$b;

    return-void
.end method
