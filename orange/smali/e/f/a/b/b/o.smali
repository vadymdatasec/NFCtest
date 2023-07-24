.class public final synthetic Le/f/a/b/b/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final a:Le/f/a/b/b/l;


# direct methods
.method public constructor <init>(Le/f/a/b/b/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/b/b/o;->a:Le/f/a/b/b/l;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Le/f/a/b/b/o;->a:Le/f/a/b/b/l;

    invoke-virtual {v0, p1}, Le/f/a/b/b/l;->a(Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
