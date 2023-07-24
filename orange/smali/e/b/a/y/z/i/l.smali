.class public Le/b/a/y/z/i/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:Le/b/a/y/z/i/n;


# direct methods
.method public constructor <init>(Le/b/a/y/z/i/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/y/z/i/l;->a:Le/b/a/y/z/i/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Le/b/a/y/z/i/j;

    .line 3
    iget-object v0, p0, Le/b/a/y/z/i/l;->a:Le/b/a/y/z/i/n;

    invoke-virtual {v0, p1}, Le/b/a/y/z/i/n;->a(Le/b/a/y/z/i/j;)V

    return v1

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Le/b/a/y/z/i/j;

    .line 5
    iget-object v0, p0, Le/b/a/y/z/i/l;->a:Le/b/a/y/z/i/n;

    iget-object v0, v0, Le/b/a/y/z/i/n;->d:Le/b/a/u;

    invoke-virtual {v0, p1}, Le/b/a/u;->a(Le/b/a/c0/o/h;)V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
