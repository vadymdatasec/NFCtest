.class public final synthetic Le/f/c/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/r/a;


# instance fields
.field public final a:Le/f/c/h;

.field public final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Le/f/c/h;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/b;->a:Le/f/c/h;

    iput-object p2, p0, Le/f/c/b;->b:Landroid/content/Context;

    return-void
.end method

.method public static a(Le/f/c/h;Landroid/content/Context;)Le/f/c/r/a;
    .locals 1

    new-instance v0, Le/f/c/b;

    invoke-direct {v0, p0, p1}, Le/f/c/b;-><init>(Le/f/c/h;Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le/f/c/b;->a:Le/f/c/h;

    iget-object v1, p0, Le/f/c/b;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Le/f/c/h;->a(Le/f/c/h;Landroid/content/Context;)Le/f/c/t/a;

    move-result-object v0

    return-object v0
.end method
