.class public final synthetic Le/f/c/s/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/c/s/j;


# direct methods
.method public constructor <init>(Le/f/c/s/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/s/e;->b:Le/f/c/s/j;

    return-void
.end method

.method public static a(Le/f/c/s/j;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Le/f/c/s/e;

    invoke-direct {v0, p0}, Le/f/c/s/e;-><init>(Le/f/c/s/j;)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Le/f/c/s/e;->b:Le/f/c/s/j;

    invoke-static {v0}, Le/f/c/s/j;->a(Le/f/c/s/j;)V

    return-void
.end method
