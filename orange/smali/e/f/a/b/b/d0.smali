.class public final Le/f/a/b/b/d0;
.super Le/f/a/b/e/b/e;
.source "SourceFile"


# instance fields
.field public final synthetic a:Le/f/a/b/b/e;


# direct methods
.method public constructor <init>(Le/f/a/b/b/e;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/b/b/d0;->a:Le/f/a/b/b/e;

    invoke-direct {p0, p2}, Le/f/a/b/e/b/e;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/b/b/d0;->a:Le/f/a/b/b/e;

    invoke-static {v0, p1}, Le/f/a/b/b/e;->a(Le/f/a/b/b/e;Landroid/os/Message;)V

    return-void
.end method
