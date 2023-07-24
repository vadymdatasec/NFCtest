.class public final synthetic Le/f/c/u/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final a:Le/f/c/u/x;


# direct methods
.method public constructor <init>(Le/f/c/u/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/u/w;->a:Le/f/c/u/x;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/c/u/w;->a:Le/f/c/u/x;

    invoke-virtual {v0}, Le/f/c/u/x;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
