.class public final synthetic Le/f/c/p/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/k/k;


# static fields
.field public static final a:Le/f/c/p/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/p/a;

    invoke-direct {v0}, Le/f/c/p/a;-><init>()V

    sput-object v0, Le/f/c/p/a;->a:Le/f/c/p/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/f/c/k/k;
    .locals 1

    sget-object v0, Le/f/c/p/a;->a:Le/f/c/p/a;

    return-object v0
.end method


# virtual methods
.method public a(Le/f/c/k/f;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Le/f/c/p/b;->a(Le/f/c/k/f;)Le/f/c/p/d;

    move-result-object p1

    return-object p1
.end method
