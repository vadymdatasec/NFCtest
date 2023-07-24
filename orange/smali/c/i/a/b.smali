.class public Lc/i/a/b;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/i/a/c;


# direct methods
.method public constructor <init>(Lc/i/a/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/i/a/b;->a:Lc/i/a/c;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/i/a/b;->a:Lc/i/a/c;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lc/i/a/c;->b:Z

    .line 2
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onInvalidated()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/i/a/b;->a:Lc/i/a/c;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lc/i/a/c;->b:Z

    .line 2
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void
.end method
