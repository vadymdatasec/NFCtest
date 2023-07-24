.class public final synthetic Le/f/c/q/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/a;


# instance fields
.field public final a:Le/f/c/q/v;

.field public final b:Landroid/util/Pair;


# direct methods
.method public constructor <init>(Le/f/c/q/v;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/q/u;->a:Le/f/c/q/v;

    iput-object p2, p0, Le/f/c/q/u;->b:Landroid/util/Pair;

    return-void
.end method


# virtual methods
.method public final a(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le/f/c/q/u;->a:Le/f/c/q/v;

    iget-object v1, p0, Le/f/c/q/u;->b:Landroid/util/Pair;

    invoke-virtual {v0, v1, p1}, Le/f/c/q/v;->a(Landroid/util/Pair;Le/f/a/b/h/g;)Le/f/a/b/h/g;

    return-object p1
.end method
