.class public Le/a/a/c0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/android/volley/VolleyError;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/android/volley/VolleyError;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Le/a/a/c0/p;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Le/a/a/c0/p;->b:Lcom/android/volley/VolleyError;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/android/volley/VolleyError;Le/a/a/c0/o;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/a/a/c0/p;-><init>(Ljava/lang/String;Lcom/android/volley/VolleyError;)V

    return-void
.end method

.method public static synthetic a(Le/a/a/c0/p;)Lcom/android/volley/VolleyError;
    .locals 0

    .line 1
    iget-object p0, p0, Le/a/a/c0/p;->b:Lcom/android/volley/VolleyError;

    return-object p0
.end method

.method public static synthetic b(Le/a/a/c0/p;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le/a/a/c0/p;->a:Ljava/lang/String;

    return-object p0
.end method
