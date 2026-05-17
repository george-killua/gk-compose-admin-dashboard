package dev.gkcoding.admindemo.data

data class Metric(val label: String, val value: String, val trend: String)
data class Project(val name: String, val status: String, val priority: String)

val metrics = listOf(
    Metric("Open requests", "18", "+4 this week"),
    Metric("Active builds", "6", "2 ready for review"),
    Metric("Avg. response", "2.4h", "fast"),
)

val projects = listOf(
    Project("Clinic booking MVP", "Design review", "High"),
    Project("Restaurant website", "Content integration", "Medium"),
    Project("Android refactor", "Architecture pass", "High"),
)
