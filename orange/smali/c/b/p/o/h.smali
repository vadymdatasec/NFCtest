.class public Lc/b/p/o/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc/b/q/s1;

.field public final b:Lc/b/p/o/m;

.field public final c:I


# direct methods
.method public constructor <init>(Lc/b/q/s1;Lc/b/p/o/m;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/b/p/o/h;->a:Lc/b/q/s1;

    .line 3
    iput-object p2, p0, Lc/b/p/o/h;->b:Lc/b/p/o/m;

    .line 4
    iput p3, p0, Lc/b/p/o/h;->c:I

    return-void
.end method


# virtual methods
.method public a()Landroid/widget/ListView;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/h;->a:Lc/b/q/s1;

    invoke-virtual {v0}, Lc/b/q/p1;->g()Landroid/widget/ListView;

    move-result-object v0

    return-object v0
.end method
